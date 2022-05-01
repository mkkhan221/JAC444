
public class TestBycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bmw=new Bicycle(2,1,1);
		Bicycle sports=new Bicycle(bmw);
		
		bmw.printDescription();
		sports.printDescription();
	}

}
