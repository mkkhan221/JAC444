package lamda;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,5};
		Summable average = (x)->{
			int a=0;
			for (int i = 0; i < x.length; i++){
			a += x[i];
			}
			a = a/x.length;
			return a;


		};
		int averageNumber = average.arrayAverage(arr);
		System.out.println("The average is :"+averageNumber);


		
		
//		FuncInterfaceDemo result = (num1)->num1*num1;
//		System.out.println(result.compute(10));
//		
//				System.out.println("the added value is :" + compute((num)->num+10,10));
//				System.out.println("The value from subtraction is :" + compute((num)->num-10,10));
//				System.out.println("The value from multiplication is :" + compute((num)->num*10,10));
//		
//				System.out.println("The value from division is :" + compute((num)->num/10,10));
//	
	}
	
	public static int compute(FuncInterfaceDemo add,int num)
	{
		return add.compute(num);
	}

}
