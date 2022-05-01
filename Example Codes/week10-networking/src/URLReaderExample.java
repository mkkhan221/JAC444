import java.net.*; 
import java.io.*; 

public class URLReaderExample { 
	public static void main(String[] args) throws Exception { 
	
	URL seneca = new 
	URL(" https://www.senecacollege.ca/about/policies/student-progression-and-promotion-policy.html "); 

	BufferedReader in = new BufferedReader( new InputStreamReader(seneca.openStream())); 
	
	String inputLine = ""; 

	while (inputLine != null){ 
		inputLine = in.readLine();
		System.out.println(inputLine);
	}
	in.close(); 
	} 
}
