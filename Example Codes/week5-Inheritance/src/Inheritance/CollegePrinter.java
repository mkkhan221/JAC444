package Inheritance;

public interface CollegePrinter {
	
	void pri(String s);
	void copy(String s);
	
	default void log(String str) {
		System.out.println("I am from CollegePrinter" + str);
	}

}
