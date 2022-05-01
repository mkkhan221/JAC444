 class SimpleThread1 implements Runnable {   
               public void run(){      
                 for (int i=0;i<2;i++) 
                                System.out.print(i);  
   }  
}  



public class Test10 {   
              public static void main(String args[])
		{    
                      SimpleThread s= new SimpleThread();
                      Thread t= new Thread(s);
                      Test10 test = new Test10(); 
                      test.call(t); 
                 }
              public void call(Thread st)
		{      
                              st.start(); 
                }    
    }  