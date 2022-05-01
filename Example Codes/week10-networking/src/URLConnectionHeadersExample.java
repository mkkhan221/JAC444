import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionHeadersExample {
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.senecacollege.ca/programs/bycredential/graduate-certificate.html");
			URLConnection urlConnection = url.openConnection();
			urlConnection.setDoOutput(true);
			urlConnection.connect();
			
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
/*General Header: This type of headers applied on Request and Response headers 
 					both but with out affecting the database body.
Request Header: This type of headers contains information about the fetched request 
				by the client.
Response Header: This type of headers contains the location of the source 
				that has been requested by the client.
Entity Header: This type of headers contains the information about the body 
				of the resources like MIME type, Content-length.
*/
			Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
			Set<Map.Entry<String, List<String>>> entrySet = headerFields.entrySet();
			for(Map.Entry<String, List<String>> entry : entrySet) {
				String key = entry.getKey();
				List<String> value = entry.getValue();
				
				System.out.println("---Key = "+key);
				for(String string : value) {
					System.out.println("value = "+value);
				}
			}
			String line ="";
			
			while(line!=null) {
				line = inputStream.readLine();
				System.out.println(line);
			}
			inputStream.close();
			
		}catch(MalformedURLException e) {
			System.out.println("Marlformed URL "+e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}
	}

}
