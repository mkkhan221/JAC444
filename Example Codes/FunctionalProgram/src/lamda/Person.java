package lamda;
import java.time.*;

public class Person {

    // ...
    
    LocalDate birthday;
    
    public int getAge() {
        // ...
    	return 0;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }   

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
    
    // ...
}