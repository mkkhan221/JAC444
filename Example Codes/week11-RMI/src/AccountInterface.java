import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AccountInterface extends Remote {
	public String getName() throws RemoteException;
    public float getBalance() throws RemoteException;
    public void withdraw(float amt) throws RemoteException;
    public void deposit(float amt) throws RemoteException;
    public void transfer(float amt, AccountInterface src) throws RemoteException;

}
