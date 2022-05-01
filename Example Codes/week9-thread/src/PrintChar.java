public class PrintChar implements Runnable{

    private char aChar;
    private int times;

    public PrintChar(char c, int t){
        this.aChar = c;
        this.times = t;
    }

    @Override
    public void run(){
        for(int i=0; i<times; i++){
//        	try {
//        		//Thread.sleep(500);}
//        	catch(InterruptedException e){ System. out.println (e);}
        	System.out.println(Thread.currentThread().getName());    
            System.out.print(" " + aChar);
        }
    }

}
