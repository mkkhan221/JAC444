import java.io.*;
public class Employee implements Serializable{
	public static int permenant=1;
	public String name;
	public String address;
	public transient int SSN;
	public int number;
}
