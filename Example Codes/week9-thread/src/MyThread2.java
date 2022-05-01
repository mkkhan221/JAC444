class MyThread2 implements Runnable {
	Table t;
	MyThread2(Table t){
		this.t=t;}
	
	@Override
	public void run(){
		
		try {
		t.printTable(10);
		//Thread.sleep(500);
}
		catch(Exception e) {
			System.out.print(e);
		}
}
}