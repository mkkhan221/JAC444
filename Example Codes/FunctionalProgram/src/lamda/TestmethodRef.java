package lamda;

import java.util.List;

public class TestmethodRef {

	public TestmethodRef() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
		
		//*** Using Lambda Expression ***//
		A a1 = (x) -> { return x > -10 && x < 10;};
		System.out.println(a1.checkSingleDigit(10));
		
		//*** Using Method Reference ***//
		A a2 = Digit::isSingleDigit;
		System.out.println(a2.checkSingleDigit(9));
		
		

		}

}
