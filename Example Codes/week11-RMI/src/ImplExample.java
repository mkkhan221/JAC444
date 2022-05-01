import java.rmi.RemoteException;

public class ImplExample implements Hello {

	@Override
	public void printMsg() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("This is an example RMI program");  
	}

}
