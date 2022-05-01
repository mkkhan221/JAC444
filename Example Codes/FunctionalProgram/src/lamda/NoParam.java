package lamda;

public class NoParam implements MixInter{
	public static void main(String...strings) {
	MixInter msg = ()-> "This is lambda without parameter";
	
	System.out.println(msg.Hello());
	MixInter msg1 = new NoParam();
	
	System.out.println(msg1.Hello());
	}

	@Override
	public String Hello() {
		
		return "This is normal implementation";
	}
}
