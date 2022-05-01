
public class MultiGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiGenericPara<String, String> mondayWeather =
		        new MultiGenericPara<String, String>("Monday", "Sunny");
		MultiGenericPara<Integer, Double> dayOfWeekDegrees = 
		        new MultiGenericPara<Integer, Double>(1, 78.0); //Autoboxing double to Double

		String mondayForecast = mondayWeather.getFirstPosition();
		System.out.println(mondayForecast);
		// The Double type is unboxed--to double, in this case. More on this in next section!
		double sundayDegrees = dayOfWeekDegrees.getSecondPosition(); //unboxing Double to double
		System.out.println(sundayDegrees);
	}

}
