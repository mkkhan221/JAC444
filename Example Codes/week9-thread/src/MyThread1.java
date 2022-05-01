class MyThread1 implements Runnable {
	Table t;
	MyThread1(Table t){
		this.t=t;}
	
	@Override
	public void run(){
		try	{
			//Thread.sleep(1000);
			t.printTable(5);
			
			
		}
		catch (Exception e){ System.out.println(e);
		}
		
	
}
	/*
	 
	 */
}