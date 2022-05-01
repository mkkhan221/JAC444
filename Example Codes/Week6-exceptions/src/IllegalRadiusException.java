
public class IllegalRadiusException extends Exception{

	public IllegalRadiusException() {
		// TODO Auto-generated constructor stub
		super("The radius should be positive");
	}
	@Override
	public String toString() {
		return "The radius should be positive";
	}

}
