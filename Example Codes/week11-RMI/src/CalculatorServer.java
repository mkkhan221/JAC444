import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.server.ExportException;


public class CalculatorServer extends CalculatorImpl {
	
	public CalculatorServer() throws RemoteException{
		
	}
//	public CalculatorServer() throws RemoteException{
//		try {
//			Calculator cal = new CalculatorImpl();
//			Naming.rebind("rmi://localhost:1099/CalculatorService", cal);
//		}catch(Exception e) {
//			System.out.println("Trouble: "+e.getMessage());
//		}
//	}
	public static void main(String[] args) throws RemoteException{
		try {
			CalculatorImpl cal = new CalculatorImpl();
			
			Calculator stub = (Calculator) UnicastRemoteObject.exportObject(cal,0);
			Registry registry = LocateRegistry.getRegistry();
			
			registry.bind("Calculator-Server", stub);
			System.err.println("Server ready"); 
		}catch (ExportException ex) { 
			 
	         System.err.println("Server exception: " + ex.toString()); 
	         ex.printStackTrace(); }
		catch (Exception e) { 
	         System.err.println("Server exception: " + e.toString()); 
	         e.printStackTrace(); }
	
//		new CalculatorServer();

	}
	
}
