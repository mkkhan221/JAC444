import java.io.*;

public class ObjectInputOutputStream {
	public static void main(String[]args ) throws IOException ,ClassNotFoundException {
		try(ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream ("object.dat"))){
			output.writeUTF("Moona");		
			output.writeDouble(85.5);
			output.writeObject(new java.util.Date());
		}
		try (ObjectInputStream input = new ObjectInputStream (new FileInputStream ("object.dat"))){
			String name =input.readUTF();
			double score =input.readDouble();
			java.util.Date date =(java.util.Date) input.readObject();
			System.out.println (name + " " + score + " " +date);
			}
	}
}