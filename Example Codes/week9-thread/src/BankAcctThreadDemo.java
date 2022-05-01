
public class BankAcctThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount task = new BankAccount();
        task.setBalance(100);
        
        Thread jane=new Thread(task);
        jane.start();
        Thread john=new Thread(task);
        john.start();
        new Thread()
        	{  public void run(){ 
        		task.makeWithdraw(1500);
        	}
        }.start();
        
        new Thread()
    	{  public void run(){ 
    		task.deposit(2000);
    	}
    }.start();

    }



}
