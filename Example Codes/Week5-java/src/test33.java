import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test33 {
        public static void main(String[] args) throws Exception {
               child b1 = new child(100, 200);
               System.out.println("i = " + b1.i);
               System.out.println("j = " + b1.j);
               try (FileOutputStream fos = new FileOutputStream("abc.ser");
               ObjectOutputStream oos = new ObjectOutputStream(fos)){
            	   oos.writeObject(b1);
               //oos.close();
               //fos.close();
               }
               System.out.println("Object has been serialized");
               
               try (FileInputStream fis = new FileInputStream("abc.ser");
               ObjectInputStream ois = new ObjectInputStream(fis)){
            	   child b2 = (child) ois.readObject();
               //ois.close();
               //fis.close();
            	   System.out.println("Object has been deserialized");
                   System.out.println("i = " + b2.i);
                   System.out.println("j = " + b2.j);
               }
               
       }
}