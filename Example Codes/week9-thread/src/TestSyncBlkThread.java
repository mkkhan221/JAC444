
public class TestSyncBlkThread {
	private static void demo(){
        Object lock = new Object();
        Thread one = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println("INFO: Thread One is waiting for the lock");
                synchronized (lock){
                    System.out.println("INFO: Thread One got the Lock");
                    System.out.println("One is printing - 1");
                
             try{
                   System.out.println("INFO: Thread One is ready to go to the Wait state, giving up th econtrol");
                 lock.wait();
               }catch (InterruptedException e){
                 e.printStackTrace();
              }
                System.out.println("INFO: Thread Two wake up Thread One, and Thread one gains the lock");
                System.out.println("One is printing - 2");
                System.out.println("One is printing - 3");
            }}
        });

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("INFO: Thread two is waiting for the lock");
                synchronized (lock) {
                    System.out.println("INFO: Thread two got the Lock");
                    System.out.println("Two is printing - 1");
                    System.out.println("Two is printing - 2");
                    System.out.println("Two is printing - 3");
                    System.out.println("INFO: Thread two end printing, and calling the notify method");
                  lock.notify();
                        
                    }

                }
            
        });

        one.start();
        two.start();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
	}

}
