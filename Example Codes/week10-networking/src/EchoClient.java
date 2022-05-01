import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		//Client doesn't need the ServerSocket but just a Socket
		//127.0.0.1 or localhost generally both works
			try(Socket socket = new Socket("127.0.0.1", 5000)){
				BufferedReader echoes = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);
				
				Scanner scanner = new Scanner(System.in);
				String echoString;
				String response;
				
				do {
					System.out.println("Enter the string to be echoed: ");
					echoString = scanner.nextLine();
					
					stringToEcho.println(echoString);
					if(!echoString.equals("exit")) {
						response = echoes.readLine();
						System.out.println(response);
					}
				}while(!echoString.equals("exit"));
				
				
		}catch (IOException e) {
			System.out.println("Client Exception"+e.getMessage());
		}
	
	}
	
}
