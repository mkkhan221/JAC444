
public class Table {
	/*synchronized*/
	synchronized void printTable(int n)
	{//method not synchronized
		for	(int i = 1; i <= 5; i++) 
		{
			System.out.println( n * i);
			
		}
	}
}
