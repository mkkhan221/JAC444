
public class TestPassArray {

	public static void main(String[] args) {
		int[] a = {1, 2};

	    // Swap elements using the swap method
	    System.out.println("Before invoking swap");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    
	    // is it pass by val or ref?
	    swap(a[0], a[1]);
	    
	    // What should be the value printed?
	    System.out.println("After invoking swap");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");

	    // Swap elements using the swapFirstTwoInArray method
	    System.out.println("Before invoking swapFirstTwoInArray");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    
	 // is it pass by val or ref?
	    swapFirstTwoInArray(a);
	    
	    // What should be the value printed?
	    System.out.println("After invoking swapFirstTwoInArray");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	  }

	  /** Swap two variables */
	  public static void swap(int n1, int n2) {
	    int temp = n1;
	    n1 = n2;
	    n2 = temp;
	  }

	  /** Swap the first two elements in the array */
	  public static void swapFirstTwoInArray(int[] array) {
	    int temp = array[0];
	    array[0] = array[1];
	    array[1] = temp;
	  }
	}
