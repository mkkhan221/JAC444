public class PrintString implements Runnable{

    private String aString;
    private int times;

    public PrintString(String s, int t){
        this.aString = s;
        this.times = t;
    }

    @Override
    public void run(){
        for(int i=0; i<times; i++){
//        	try {
//        		Thread.sleep(500);}
//        	catch(InterruptedException e){ System. out.println (e);}
        	System.out.println(Thread.currentThread().getName());    
            System.out.print(" "+aString);
        }
    }
   
 
}
