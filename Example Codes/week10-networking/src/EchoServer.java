import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String [] args) {
		// creating a ServerSocket and giving it a port number
		try(ServerSocket serverSocket = new ServerSocket(5000)){
			Socket socket = serverSocket.accept(); // creating socket and opening for connection from client
			System.out.println("Client Connected");
			
			// Server use Input & Output Streams to send and recieve data from the client
			//Socket doesn't get Input & Output stream but use the scoket.getInputStream and
			//socket.getOutputStream for input and output of data associated with the serverSocket
			//common practice is to wrap your InputStream with BufferedReader and PrintWriter for OutputStream
			BufferedReader input = new BufferedReader( new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
			
			while(true) {
				String echoString = input.readLine();
				System.out.println(" "+echoString);
				if(echoString.equals("exit")){
					break;
				}
				output.println("Echo from server: "+ echoString);
			}
			
		} catch(IOException e) {
			System.out.println("Server Exception"+e.getMessage());
		}
	}

}
