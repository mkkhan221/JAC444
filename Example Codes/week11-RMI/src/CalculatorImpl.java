import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl implements Calculator {
	
	public CalculatorImpl() throws RemoteException{
		
	}
	
	public long add(long a, long b) throws RemoteException{
		
		return a+b;
	}
	
	public long sub(long a, long b) throws RemoteException{
			
			return a-b;
		}
	public long mul(long a, long b) throws RemoteException{
		
		return a*b;
	}
	public long div(long a, long b) throws RemoteException{
		
		return a/b;
	}

}
