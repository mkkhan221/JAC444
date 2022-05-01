
public class CircleTest {

	public CircleTest()  {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleException c= new CircleException();
		try {
		c.setRadius(-2);
		}
		catch(IllegalRadiusException e) {
			e.printStackTrace();
		}
		System.out.println(c.findArea());
		
	}

}
