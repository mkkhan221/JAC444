import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Chat extends UnicastRemoteObject implements ChatInterface {
	public String name;
	public ChatInterface client=null;
	
	public Chat(String n) throws RemoteException {
		this.name=n;
	}
	
	@Override
	public String getName() throws RemoteException {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void send(String msg) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	@Override
	public void setClient(ChatInterface c) throws RemoteException {
		// TODO Auto-generated method stub
		client=c;
	}

	@Override
	public ChatInterface getClient() throws RemoteException {
		// TODO Auto-generated method stub
		return client;
	}

}
