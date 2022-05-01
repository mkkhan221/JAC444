package lamda;

@FunctionalInterface
public interface Summable {
	//public boolean evensum(int x , int y);
	public int arrayAverage(int arr[]);
	public default void print() {
		System.out.print("This is default function");
	}
}
