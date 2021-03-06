
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/*
 * Terminates a TASK by using a flag inside it. 
 * Note that the task will not terminate immediately (that's why we put main to sleep for a while)
 * Comment the cancel() invocation to see the task finishing its job.
 * 
 * Here, after the task is cancelled, the thread is again available in the thread pool.
 * When using the Thread API, when the task is cancelled the thread dies as well
 */

public class TerminateTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{

		System.out.println("Thread main started");
		
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(5);
		SumFirstNumbersSyn sumtask1=new SumFirstNumbersSyn(40);
		SumFirstNumbersSyn sumtask2=new SumFirstNumbersSyn(40);
		SumFirstNumbersSyn sumtask3=new SumFirstNumbersSyn(40);
		List<Future<Integer>> result = threadPoolExecutor.invokeAll(Arrays.asList(
				sumtask1, sumtask2,sumtask3));
		sumtask1.cancel();
		for (Future<Integer> value : result) {
			System.out.println("Task is finished: " + value.isDone());
			System.out.println(value.get());
		}
		//System.out.println("Number of active Threads in the pool: " + threadPoolExecutor.getActiveCount());
		
		
		
		
		//Thread.sleep(500l);
		
//		System.out.println("Number of active Threads in the pool: " + threadPoolExecutor.getActiveCount());
//		System.out.println("Result: " + result.get());
//		
		threadPoolExecutor.shutdown();

		System.out.println("Thread main finished");
	}
}

class SumFirstNumbersSyn implements Callable<Integer> {
	private int n;
	private volatile boolean cancelTask;
	
	
	public SumFirstNumbersSyn(int n) {
		this.n = n;
		this.cancelTask = false;
	}
	
	public Integer call() {
		int sum = 0;
		//synchronized (this) {
		for (int i = 1; i <= n; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
			sum += i;
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		
			//synchronized (this) {
				if (cancelTask) {
					return -1;
				}
			//}
		//}
	}
		return sum;
	}
	
	public void cancel() {
		//synchronized (this) {
			this.cancelTask = true;
		//}
	}
}
