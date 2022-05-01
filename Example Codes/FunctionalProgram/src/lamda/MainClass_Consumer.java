package lamda;
import java.util.function.Consumer;
public class MainClass_Consumer {

	
	
	    public static void main(String args[]) {
	        String message = "Hello world!";
	        Consumer<String> myConsumer = x -> System.out.println(x);
	        myConsumer.accept(message);
	        //prints Hello world!
	    }
	

}
