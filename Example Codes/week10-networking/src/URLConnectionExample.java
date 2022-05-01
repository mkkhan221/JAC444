import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
public class URLConnectionExample {
	
	public static void main(String[] args) {
		
		try {
			//URL url = new URL("https://ict.senecacollege.ca/course/jav745?q=course/jav745");
			URL url=new URL("https://ict.senecacollege.ca/~ipc144/pages/content/scope.html#pas");
			HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection(); 
			
//			System.out.println ("protocol = " + url.getProtocol());
//			System.	out.println ("authority = " + url.getAuthority());
//			System.	out.println ("host = " + url.getHost());
//			System.out.println ("port = " + url.getPort());
//			System.out.println ("path = " + url.getPath());
//			System.out.println ("query = " + url.getQuery());
//			System.out.println ("filename = " + url.getFile());
//			System.out.println ("ref = " + url.getRef());
//			
			//BufferedReader inputStream = new BufferedReader ( new InputStreamReader(url.openStream ()));
//			
			//URLConnection urlConnection = url.openConnection(); //for htp htp connection , if jar then jar connection
//
//			urlConnection.setDoInput(true); //doInput variable is default to true means connection in read mode
//			urlConnection.setDoOutput(true); //doOutput variable is default to false .set to true means connection in write mode
//			urlConnection.connect();
//			
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line ="";
			
			while(line!=null) {
				line = inputStream.readLine();
				System.out.println(line);
			}
			inputStream.close();
			
			}catch(MalformedURLException e) {
			System.out.println("Marlformed URL "+e.getMessage());
			}
			catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}
	}

}
