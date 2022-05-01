
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		String s2="Hello";
		String s3=new String("Hello");
		/*
		System.out.println(s1);
		System.out.println(s2);
		
		if (s1.equals(s2)) {
			System.out.println("String 1 ");
			
		}
		if (s1.equals(s3)) {
			System.out.println("String 1 ");	
		}
		if (s1==s2) {
			System.out.println("s1 == s2 :True ");
		}
		if (s1==s3) {
			System.out.println("s1==s3:True ");
		}
		
		*/	
		s1="Hello World";
		s3="Hello World";
		
		System.out.println(s1);
		System.out.println(s3);
		

		if (s1.equals(s2)) {
			System.out.println("String 1 ");
			
		}
		if (s1.equals(s3)) {
			System.out.println("String 1 ");	
		}
		if (s1==s2) {
			System.out.println("s1 == s2 :True ");
		}
		if (s1==s3) {
			System.out.println("s1==s3:True ");
		}
		
		
		
		
		System.out.println(s1.replace('e','m'));
		
	}

}
