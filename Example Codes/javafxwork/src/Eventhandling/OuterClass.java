package Eventhandling;

public class OuterClass {
	private int data =0;
	OuterClass()
	{ 
		InnerClass y = new InnerClass();
	    y.m2();
    }
	public void m1() {
	data++;
	}

	public static void main(String[] args ) {
		OuterClass x = new OuterClass();
		System.out.println(x.data);
		
	}

	class InnerClass {
		public void m2() {
			/* Directly reference data and method defined in outer class */
			data++;
			m1();
		}
	}
}