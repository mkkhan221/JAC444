import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;


public class ThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		// TODO Auto-generated method stub
//		Executor executorService = Executors.newSingleThreadExecutor();
//		executor.execute(new PrintChar('a',10));
//		executor.execute(new PrintString("Hello",10));
//		executor.execute(new PrintNumber (10));
//		ExecutorService executorService = Executors.newFixedThreadPool(1);
		ExecutorService executorService = Executors.newCachedThreadPool();
		//executor.execute(() -> System.out.println("Hello World"));
		executorService.execute(new PrintChar ('a',10));
		executorService.execute(new PrintNumber (10));
		executorService.execute(new PrintString ("Hello", 10));
		//executorService.execute(new PrintChar ('a',10));
		
//		Future<String> future = executorService.submit(() -> "Hello World");
//		String result = future.get();
//		System.out.println(result);

//		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//				executor.submit(() -> {
//				    Thread.sleep(1000);
//				    System.out.println("Hello");
//				    return null;
//				});
//				executor.submit(() -> {
//				    //Thread.sleep(1000);
//				    return null;
//				});
//				executor.submit(() -> {
//				   // Thread.sleep(1000);
//					System.out.println("World");
//				    return null;
//				});
				
				
		//		ExecutorService executor = Executors.newFixedThreadPool (
				
	}

}
