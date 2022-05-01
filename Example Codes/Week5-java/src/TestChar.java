import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.IOException ;

public class TestChar {
	public static void main(String[]args ) throws IOException {
		//FileReader inputStream = null;
		FileWriter outputStream = null;
		String filename="./src/test.txt";

		try (FileReader inputStream = new FileReader (filename))
		{
			
			outputStream= new FileWriter ("characteroutput.txt");
			int c;
			while ((c =inputStream.read ()) != -1) {
				outputStream.write(c);
				System.out.print((char)c);
			}
		}
		catch (IOException e){
			System.out.println(e);
		}
		finally {
			/*if (inputStream != null) {
				inputStream.close();
				System.out.println("done");
			}*/
			if (outputStream != null) {
				outputStream.close();
				System.out.println("done");
			}
		}
	}
}