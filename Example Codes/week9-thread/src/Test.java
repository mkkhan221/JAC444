class SimpleThread implements Runnable {
 @Override
 public void run(){
  try{
 for(int i=0;i<4;i++)
 {
     Thread.sleep(100);
 System.out.println(Thread.currentThread().getName());
 }
 }
    catch(InterruptedException e) {
         }
   }
}
public class Test {
 public static void main(String args[]) throws InterruptedException{
 SimpleThread s= new SimpleThread();
 Thread t= new Thread(s, "A");
 Thread th= new Thread(s, "B");
 t.start();
  t.join();
  th.start();
 }
}