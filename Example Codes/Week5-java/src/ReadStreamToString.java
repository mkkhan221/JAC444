import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
 
public class ReadStreamToString
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
       InputStream in = new FileInputStream(new File("./src/test.txt"));
        //Bufferreader needs Inputstream or fileinputstream 
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //stringbuilder or stringbuffer class can be used to get string from the file
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        System.out.println(out.toString());   //Prints the string content read from input stream
        reader.close();
    }
}