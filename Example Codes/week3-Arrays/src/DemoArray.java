
public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];
		array=new int[10];
		for (int i=0;i<array.length;i++) {
			array[i]=i;
		}
		
		int copyArray[]=new int[20];
		copyArray=array;
		
//		for (int c:array) {
//			System.out.println(c);
//		}
//		for (int c:copyArray) {
//			System.out.println(c);
//		}
		copyArray[1]=10;
		System.out.println(array[1]);
	}

}
