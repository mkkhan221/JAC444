
public class TestException {

	
	
		public static void main(String args[]) {
			int i=0;
			try {
				exceptionmethod();
				System.out.println("some code");
			}
			catch (ArithmeticException e){ 
				System.out.println("try different value of i");
			}
			catch (NullPointerException e) {
				System.out.println("where did that come from");
			}
			finally {
				System.out.println ("finally block is always executed");}
			System.out.println("rest of the code...");
	}
		
		public static void exceptionmethod() {
			throw new NullPointerException();
		}
	

}
