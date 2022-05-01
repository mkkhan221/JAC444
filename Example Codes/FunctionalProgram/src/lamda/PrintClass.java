package lamda;

@FunctionalInterface
interface Print {
    public void print();
}

public class PrintClass implements Print {
    public static void main(String args[]) {
        String message = "Hello world!";
       // message = "new message";
//        Print myPrinter = () -> {
//            System.out.println(message);
//            //compile time error as message has been reassigned
//        };
//        myPrinter.print();
//     //   
        PrintClass::print();
    }
    
    @Override
    public static void printInfo() {
    	 System.out.println("hello");
    }
}