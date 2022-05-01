import java.util.Arrays;
	import java.util.List;
	import java.util.concurrent.Callable;
	import java.util.concurrent.ExecutionException;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.Future;

public class CalcTask {

	
	/*https://github.com/jorgeacetozi/java-threads-examples/tree/master/src/threads
	 * Threads that returns values are better implemented in Java using Callable<V> and Future<V>
	 * Use the Executors Framework to run a Callable task
	 */

	public static void main(String[] args) throws InterruptedException, ExecutionException {
			
			System.out.println("Thread main started");
			
			ExecutorService executorService = Executors.newFixedThreadPool(3);
			List<Future<Integer>> returnedValues = executorService.invokeAll(Arrays.asList(
					new CalculatorThread(50,50,'+'), 
					new CalculatorThread(60,50,'+'),
					new CalculatorThread(10,50,'-')));
			
			for (Future<Integer> value : returnedValues) {
				System.out.println("Task is finished: " + value.isDone());
				System.out.println(value.get());
			}
			
			executorService.shutdown();
			
			System.out.println("Thread main finished");
		}
	}

	class CalculatorThread implements Callable<Integer> {
		private int val1, val2;
		char op;
		public CalculatorThread(int val1, int val2, char op) {
			this.val1 = val1;
			this.val2=val2;
			this.op=op;
		}
		 public Integer call() {
				int sum=0;
				System.out.println("[" + Thread.currentThread().getName() + "]");
				if (op=='+')
					sum=Calculator.add(val1,val2);
				else {
					sum=Calculator.subtract(val2, val1);
				}
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			
			return sum;
		}
	}