

public class TestInner {
	public static void main(String[] args) {
		//InnerClass in = new InnerClass();
		InnerClassExample in = new InnerClassExample();
		in.outerMethod();
		InnerClassExample.InnerClass innerObj = in.new InnerClass();
		innerObj.outerMethod();
	}
}
