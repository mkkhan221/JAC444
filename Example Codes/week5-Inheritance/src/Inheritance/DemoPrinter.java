package Inheritance;

public class DemoPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPrinter p=new ColorPrinter();
		//BlackAndWhite b=new BlackAndWhite();
		//Printer p1=new ColorPrinter();
		//p1=b;
		CollegePrinter cp=new ColorPrinter();
		
		cp.pri("Color");
		//b.pri("B&W");
		cp.log("color");
		
	}

}
