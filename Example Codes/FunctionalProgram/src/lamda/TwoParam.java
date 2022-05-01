package lamda;

public class TwoParam {
public static void main(String[] args) {
	
	MixInter twop = (x,y) ->{
		if((x+y)%2 == 0)
			
			return true;
		else 
			return false;
	};
	
	if(twop.evenorodd(3,2))
		System.out.println("This is even");
	else
		System.out.println("This is odd");
		
}
}
