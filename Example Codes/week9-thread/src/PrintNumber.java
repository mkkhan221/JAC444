public class PrintNumber implements Runnable{
    private int number;

    public PrintNumber(int n){
        this.number = n;
    }

    @Override
    public void run(){
        for(int i=0; i<number; i++){
//        	try {
//        		Thread.sleep(500);}
//        	catch(InterruptedException e){ System. out.println (e);}
        	System.out.println(Thread.currentThread().getName());    
            System.out.print(" "+number);
        }
    }
}
