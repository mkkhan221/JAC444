
public class TestSyncThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		MyThread1 th1= new MyThread1(obj); 
		MyThread2 th2= new MyThread2(obj); 
		MyThread2 th3= new MyThread2(obj); 
		
		Thread t1= new Thread(th1); 
		Thread t2= new Thread(th2);
		Thread t3= new Thread(th3);
		
		t1.start();
//		try{
//			t1.join();
//		}
//		catch(InterruptedException e) {
//			System.out.print(e);
//		}
		t2.start();
		t3.start();
		
		
	}

}
