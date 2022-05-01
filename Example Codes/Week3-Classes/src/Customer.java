
public class Customer {
	String fname;
	String lname;
	Loan loantaken;
	
	Customer(){
		this("john","doe");
	}
	Customer(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
		this.loantaken=null;
	}
	
	public void applyForLoan() {
		
	}
}
