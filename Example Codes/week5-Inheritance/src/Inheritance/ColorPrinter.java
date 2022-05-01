package Inheritance;

public class ColorPrinter implements CollegePrinter, SystemLog{

	public ColorPrinter() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void pri(String s) {
		System.out.print("This is"+s+"print");
}
	@Override
	public void copy(String s) {
		System.out.print("This is"+s+"copy");
	}
	@Override
	public void log(String str) {
//		CollegePrinter.super.log("College log");
//		SystemLog.super.log("System log");
		System.out.println("I am from ColorPrinter" + str);
	}
	public void method1() {
		System.out.println("this is System log method");
	}
}