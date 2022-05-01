public class Calculator{

	
  public static synchronized int add(int value1, int value2 ){
     
	  return value1+ value2;
  }

  public static synchronized int subtract(int value1, int value2){
    return value1-value2;
  }
  
 
}