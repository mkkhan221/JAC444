import java.io.*;
public class DeserialDemo {

   public static void main(String [] args) {
      Employee e = null;
      try (FileInputStream fileIn = new FileInputStream("employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn)){
         
         e = (Employee) in.readObject();
         
      } catch (IOException i) {
         i.printStackTrace();
         
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
   }
}