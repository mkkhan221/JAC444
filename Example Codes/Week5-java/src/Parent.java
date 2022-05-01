import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class Parent implements Serializable {
       int i;
       public Parent(int i) {
             this.i = i;
       }
}
 
class child extends Parent {
        int j;
        public child(int i, int j) {
               super(i);
               this.j = j;
        }
       private void writeObject(ObjectOutputStream out) throws IOException {
               throw new NotSerializableException();
        }
        private void readObject(ObjectInputStream in) throws IOException {
              throw new NotSerializableException();
        }
}
 
