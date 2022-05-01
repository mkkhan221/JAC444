package lamda;
import java.util.*;

class PersonAgeCompare implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }
}