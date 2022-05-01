
public class CLA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Maths m=new Maths();
		if(	args.length == 3) {
			    a =Integer.parseInt(args[0]);
				b =Integer.parseInt(args[2]);
				if(args[1]=="+") {
					m.add(a, b);
				}
				else if (args[1]=="-"){
					m.sub(a,b);
				}
				System.out.println(a+b);
	 
	}

  }
}
