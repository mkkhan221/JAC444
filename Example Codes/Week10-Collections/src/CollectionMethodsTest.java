
import java.util.*;
//import static StaticTestData.*;

public class CollectionMethodsTest {

  public static void main(String[] args) {
    StaticTestData.mondayTasks.add(new PhoneTask("Ruth", "567 1234"));
    StaticTestData.mondayTasks.add(StaticTestData.databaseCode);
    
    System.out.println(StaticTestData.mondayTasks);
    Collection<Task> allTasks = new ArrayList<Task>(StaticTestData.mondayTasks);
    allTasks.addAll(StaticTestData.tuesdayTasks);
    allTasks.addAll(StaticTestData.codingTasks);
    
    System.out.println(StaticTestData.tuesdayTasks);
    System.out.println(allTasks);
    Set<Task> naturallyOrderedTasks = new TreeSet<Task>(StaticTestData.mondayTasks);
    naturallyOrderedTasks.addAll(StaticTestData.tuesdayTasks);
    System.out.println(naturallyOrderedTasks);
    
    NavigableSet<PriorityTask> priorityTasks = new TreeSet<PriorityTask>();
    priorityTasks.add(new PriorityTask(StaticTestData.mikePhone, Priority.MEDIUM));
    priorityTasks.add(new PriorityTask(StaticTestData.paulPhone, Priority.HIGH));
    priorityTasks.add(new PriorityTask(StaticTestData.databaseCode, Priority.MEDIUM));
    priorityTasks.add(new PriorityTask(StaticTestData.interfaceCode, Priority.LOW));
    
    System.out.println(priorityTasks);
   System.out.println(priorityTasks.descendingSet());
   System.out.println(priorityTasks.pollFirst());
   System.out.println(priorityTasks);
   
   final int INITIAL_CAPACITY = 10;
   Comparator<PriorityTask> priorityComp = new Comparator<PriorityTask>() {
     public int compare(PriorityTask o1, PriorityTask o2) {
       return o1.getPriority().compareTo(o2.getPriority());
     }
   };
   Queue<PriorityTask> priorityQueue =
           new PriorityQueue<PriorityTask>(INITIAL_CAPACITY, priorityComp);
   priorityQueue.add(new PriorityTask(StaticTestData.mikePhone, Priority.MEDIUM));
   priorityQueue.add(new PriorityTask(StaticTestData.paulPhone, Priority.HIGH));

   PriorityTask nextTask = priorityQueue.poll();
  
   System.out.println(nextTask);
   
//throws ConcurrentModificationException
//    for (Task t : StaticTestData.tuesdayTasks) {
//      if (t instanceof PhoneTask) {
//    	  System.out.println(t+"is being removed");
//    	  StaticTestData.tuesdayTasks.remove(t);
//      }
//    }
// throws ConcurrentModificationException
//    for (Iterator<Task> it = StaticTestData.tuesdayTasks.iterator() ; it.hasNext() ; ) {
//      Task t = it.next();
//      if (t instanceof PhoneTask) {
//    	  System.out.println(t+"is being removed");
//    	  StaticTestData.tuesdayTasks.remove(t);
//      }
//    }
    for (Iterator<Task> it = StaticTestData.tuesdayTasks.iterator() ; it.hasNext() ; ) {
      Task t = it.next();
      if (t instanceof PhoneTask) {
    	  System.out.println(t+"is being removed");
    	  
        it.remove();
      }
    }
  }
}