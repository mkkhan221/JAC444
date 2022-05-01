public class BankAccount implements Runnable{
        private double balance;
        public void setBalance(double balance){
            this.balance = balance;
        }

        @Override
        public void run(){
            makeWithdraw(75);
            if(balance < 0){
               System.out.println("Money is OverDrawn!!");
         }
       }
        //private void makeWithdraw(double amount)
        synchronized void makeWithdraw(double amount)
        {
           
           if (balance < amount) {
            	System.out.println ("Less Balance, waiting for deposit");
            	try {
            		wait();
            	}
            	catch(Exception e) { System.out.print(e);}
            	
            }
            else {
              //  System.out.println("Sorry not enough money" + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + "is about to withdraw");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "has withdrawn");
            }
        }
          synchronized void deposit(int amount)
        //synchronized void deposit(int amount) 
          {
        	System.out.println ("going to deposit");
        	balance+=amount;
        	System.out.println("depoist completed...");
        	notifyAll();
        	System.out.println("wakeup...");
        }
    }