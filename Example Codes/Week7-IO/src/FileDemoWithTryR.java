import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileDemoWithTryR {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		
		//FileInputStream in=null;
		String filename="./src/test.txt";
		File f=new File(filename);
		/* try with resources to auto close resource when done 
		/previously close() to be called in finally throws IOexception
		and must be handled. It uses AutoClosable Interface 
		which can have user implementation*/
		try(FileInputStream in = new FileInputStream(f)){
			int data = 0;
	        while((data = in.read()) != -1){
	            
	            
	            System.out.print((char) data);
	        }
		}
		

	}

}
