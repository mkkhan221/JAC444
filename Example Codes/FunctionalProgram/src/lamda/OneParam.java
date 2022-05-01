package lamda;

public class OneParam implements MixInter {

	public static void main(String... strings) {
		//MixInter onePa = (num)->{
			//return num * num;
		//};
		//MixInter inter = new OneParam();
		MixInter obj;
		
		//System.out.println("The mulitplication using lamda exp: "+onePa.compute(5));
		//System.out.println("This is normal multiplication: " + inter.compute(6));
		System.out.println("This is subtration:" + compute((c)->(c-10),20));
		//System.out.println("This is subtration:" + OneParam::compute());
		System.out.println("This is addition:" + compute((value)->(value+value),20));
	}
	
	@Override
	public int compute(int c){
		return c;
	}
	
	//@Override
	public static int compute(MixInter obj, int c) {
		return obj.compute(c);
	}
}

