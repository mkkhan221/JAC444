package Inheritance;

public interface SystemLog {
	
	default void log(String str) {
		System.out.println("I am from System" + str);
	}
	public void method1();

}
