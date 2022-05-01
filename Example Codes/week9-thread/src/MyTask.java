
public class MyTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating my tasks
        Runnable printChar = new PrintChar('a',10);
       
        Runnable printString = new PrintString("Hello", 10);
        Runnable printNum = new PrintNumber(10);

        //creating threads and passing the tasks to it
        Thread printCharThread = new Thread(printChar);
        Thread printStringThread = new Thread(printString);
        Thread printNumThread = new Thread(printNum);

        //thread-0, thread-1 ...
        printCharThread.setName("Thread for character");
        System.out.println(printCharThread.getName());


        //0 - 5 - 10
     printNumThread.setPriority(Thread.MAX_PRIORITY);
     // printNumThread.setPriority(10);

        //starting the threads
        printCharThread.start();
        printStringThread.start();
//     try{
//         printStringThread.join();
//       }catch(InterruptedException e){
//         e.printStackTrace();
//     }

        printNumThread.start();

       // printCharThread.run();
        //printNumThread.run();

       // printCharThread.start();
        //for(int i=0; i<10; i++){
        	//System.out.println(Thread.currentThread().getName());    
          //  System.out.print(" "+i);}
	}

}
