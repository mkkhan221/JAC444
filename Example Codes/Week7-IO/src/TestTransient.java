import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class TestTransient implements Serializable {
	private transient A obj;
	private int randomvar;
	private static int staticvar=2;
	private transient int a;
	public TestTransient() {
		// TODO Auto-generated constructor stub
		obj=new A();
		randomvar=1;
		a=3;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 TestTransient b1 = new TestTransient();
         try (FileOutputStream fos = new FileOutputStream("transient.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos)){
      	   oos.writeObject(b1);
         //oos.close();
         //fos.close();
         }
         System.out.println("Object has been serialized");
         
         try (FileInputStream fis = new FileInputStream("transient.ser");
                 ObjectInputStream ois = new ObjectInputStream(fis)){
        	 TestTransient b2 = (TestTransient)ois.readObject();
                 //ois.close();
                 //fis.close();
              	   System.out.println("Object has been deserialized");
                     System.out.println("Class Test variable = " + b2.randomvar);
                     System.out.println("Class Test static variable = " + staticvar);
                    // System.out.println("Class A variable = " + b2.obj.j);
                 }
                 
         
	}

}
