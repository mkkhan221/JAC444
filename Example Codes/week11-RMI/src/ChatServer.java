import java.util.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s=new Scanner(System.in);
			Chat server = new Chat("Moona");
			Registry registry = LocateRegistry.createRegistry (2020);
			registry.rebind("Chat",server);
			System.out.println("[System] Chat Remote Object is ready:");
			while(true){
				String msg=s.nextLine ().trim();
				if (server.getClient ()!=null) {
					ChatInterface client= server.getClient();
					msg =server.getName ()+"]"+ msg;
					client.send(msg);
				}
				
			}
		}catch (Exception e) {
			System.out.println("[System] Server failed:" + e);
			}

	}
}