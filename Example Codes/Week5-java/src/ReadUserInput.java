import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
;
public class ReadUserInput {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
                      System.out.println("Enter your name");    
                      String name=br.readLine();    
                      System.out.println("Welcome "+name);    
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
	}

}
