package Eventhandling;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GUIStub extends Remote {
	void guiMethod() throws RemoteException;
}
