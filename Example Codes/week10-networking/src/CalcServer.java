//Java Program to illustrate Server Side implementation
// of Simple Calculator using UDP
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;

public class CalcServer
	{
	public static void main(String[] args) throws IOException
		{
		// Create a socket to listen at port 1234
		DatagramSocket ds= new DatagramSocket(1234);
		byte[] buf= null;
		int result=0;
		DatagramPacket DpReceive= null;
		DatagramPacket DpSend= null;
		while (true)
		{
			buf= new byte[65535];
			// create a DatgramPacketto receive the data.
			DpReceive= new DatagramPacket(buf, buf.length);
			// receive the data in byte buffer.
			ds.receive(DpReceive);
			String inp= new String(buf, 0, buf.length);
			//To remove extra spaces.
			inp=inp.trim();
			
			System.out.println("Equation Received:-" + inp);
			// Exit the server if the client sends "bye"
			if (inp.equals("bye"))
			{
				System.out.println("Client sent bye.....EXITING");
				ds.close();
				break;
			}
			result=calculation(inp);
			String res = Integer.toString(result); 
			System.out.println("Sending the result..." + result); 
			// Clear the buffer after every message. 
			buf= res.getBytes(); 
			// get the port of client. 
			int port = DpReceive.getPort();
			DpSend= new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), port);
			ds.send(DpSend); 
		} 
	} 

		public static int calculation(String inp) {
			int result;
			// Use StringTokenizerto break the
			// equation into operand and operation
			//String OPERATOR_MATCHER = "(\\+|\\-|\\*|\\/)";
			StringTokenizer st= new StringTokenizer(inp);
			System.out.print(st);
			int oprnd1 = Integer.parseInt(st.nextToken().trim());
			System.out.print(oprnd1);
			String operation = st.nextToken().trim();
			System.out.print(operation);
			int oprnd2 = Integer.parseInt(st.nextToken().trim());
			System.out.print(oprnd2);
			// perform the required operation.
			if (operation.equals("+"))
			result = oprnd1 + oprnd2;
			else if (operation.equals("-"))
			result = oprnd1 -oprnd2;
			else if (operation.equals("*"))
			result = oprnd1 * oprnd2;
			else 
				result = oprnd1 / oprnd2; 
			System.out.println(result);
			return result;
		}
}
		