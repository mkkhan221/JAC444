import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
	
	private CalculatorClient() {}
	public static void main(String[] args) {
		
try {
			Registry registry = LocateRegistry.getRegistry(null);
			
			Calculator stub = (Calculator)registry.lookup("Calculator-Server");
			
			System.out.println("Addition performed: "+stub.add(5,5));
			System.out.println("Subtraction performed: "+stub.sub(10,5));
			System.out.println("Multiplication performed: "+stub.mul(4,5));
			System.out.println("Division performed: "+stub.div(9,3));
		}catch (Exception e) {
	         System.err.println("Client exception: " + e.toString()); 
	         e.printStackTrace(); 
	      } 
	
	
//		public static void main(String[] args) {
//		try {
//			Calculator c = (Calculator)Naming.lookup("rmi://localhost/CalculatorService");
//			
//			System.out.println("Addition performed: "+c.add(3,5));
//			System.out.println("Subtraction performed: "+c.sub(10,5));
//			System.out.println("Multiplication performed: "+c.mul(4,5));
//			System.out.println("Division performed: "+c.div(9,3));
//			
//		}catch (MalformedURLException murle) { 
//			System.out.println(); 
//			System.out.println("MalformedURLException"); 
//			System.out.println(murle); 
//			} 
//			catch (RemoteException re) { 
//				System.out.println(); 	
//				System.out.println("RemoteException"); 
//				System.out.println(re); 
//			} 
//			catch (NotBoundException nbe) { 
//				System.out.println();
//				System.out.println( "NotBoundException"); 
//				System.out.println(nbe); 
//			} 
//			catch (java.lang.ArithmeticException ae) { 
//				System.out.println(); 
//				System.out.println( "java.lang.ArithmeticException"); 
//				System.out.println(ae); 
//			} 
//
	}

}
