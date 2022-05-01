package lamda;



public class App 
{ 
	public static void main(String[] args) 
	{ Runner runner = new Runner(); 
//	runner.run(new Executable() 
//		{ public void execute() 
//			{ System.out.println("Hello there."); 
//			} 
//		});
	runner.run(()->System.out.println("Hello"));
	} 
	}