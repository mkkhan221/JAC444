import java.io.FileInputStream ;
import java.io.FileOutputStream ;
import java.io.IOException ;

public class FileDemo {
	public static void main(String[]args ) {
		//FileReader inputStream = null;
		FileInputStream inputstream = null;
		FileOutputStream outputStream = null;
		String filename="./src/test.txt";

		try 
		{
			inputstream = new FileInputStream(filename);
			outputStream= new FileOutputStream ("characteroutput.txt");
			int c;
			while ((c =inputstream.read()) != -1) {
				outputStream.write(c);
				System.out.print((char)c);
			}
			inputstream.close();
			outputStream.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}