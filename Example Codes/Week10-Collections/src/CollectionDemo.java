import java.util.*;

public class CollectionDemo {

       
/*
        static final int N = 50000;
            public static void main(String... stings) {

            // Add numbers 0, 1, 2, ..., N - 1 to the array list
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++)
                list.add(i);
             Collections.shuffle(list); // Shuffle the array list

                Collection<Integer> hset = new HashSet<>(list);
                System.out.println("Adding Elements timmer for hash set: " + getTestTime(hset)+ "milliseconds" );
                System.out.println("Removing Elements timmer for hash set: " + getRemoveTime(hset)+ "milliseconds" );

                Collection<Integer> linkset = new LinkedHashSet<>(list);
                System.out.println("Adding Elements timmer for Link set: " + getTestTime(linkset)+ "milliseconds" );
                System.out.println("Removing Elements timmer for Link set: " + getRemoveTime(linkset)+ "milliseconds" );

                Collection<Integer> treeset = new TreeSet<>(list);
                System.out.println("Adding Elements timmer for Tree set: " + getTestTime(treeset)+ "milliseconds" );
                System.out.println("Removing Elements timmer for Tree set: " + getRemoveTime(treeset)+ "milliseconds" );

                Collection<Integer> arrlist = new ArrayList<>(list);
                System.out.println("Adding Elements timmer for ArrayList: " + getTestTime(arrlist)+ "milliseconds" );
                System.out.println("Removing Elements timmer for ArrayList: " + getRemoveTime(arrlist)+ "milliseconds" );

                Collection<Integer> linklist = new LinkedList<>(list);
                System.out.println("Adding Elements timmer for LinkedList: " + getTestTime(linklist)+ "milliseconds" );
                System.out.println("Removing Elements timmer for LinkedList: " + getRemoveTime(linklist)+ "milliseconds" );


            }

            public static long getTestTime(Collection<Integer> col){

                long startTime = System.currentTimeMillis();

                for(int i=0; i<N; i++){
                    col.contains((int)Math.random() * 2 * N);
                }
                return System.currentTimeMillis() - startTime;

            }

            public static long getRemoveTime(Collection<Integer> colr){
                long startTime = System.currentTimeMillis();

                for(int i=0; i<N; i++){
                    colr.remove(i);
                }
                return System.currentTimeMillis() - startTime;
            }
*/

        public static void main(String... strings){
       
        	Map<String, Integer> hmap = new HashMap<>();
            hmap.put("Ali",123);
            //hmap.put("Ali",123);
            hmap.put("Zink",123);
            hmap.put("Dorry",431);
            hmap.put("Blue",123);

            System.out.println("The elements in the hash map: "+hmap);

            Map<String, Integer> treemap = new TreeMap<>();
            treemap.put("Ali",123);
            treemap.put("Zink",123);
            treemap.put("Dorry",431);
            treemap.put("Blue",123);

            System.out.println("The elements in the hash map: "+treemap);

            Map<String, Integer> linkmap = new LinkedHashMap<>();
            linkmap.put("Ali",123);
            linkmap.put("Zink",123);
            linkmap.put("Dorry",431);
            linkmap.put("Blue",123);

            System.out.println("The elements in the hash map: "+linkmap);

            System.out.println("The value for Zink is: " + hmap.get("Zink"));

            System.out.println("The Key and the Values are: ");
            hmap.forEach((String, Integer) -> System.out.println(String+  " " + Integer));
        /*    
             //creating a HashSet
        Set<String> hset = new HashSet<>();
        hset.add("Toronto");
        hset.add("Toronto");
        hset.add("Montreal");
        hset.add("Edmonton");
        hset.add("Vancover");
        hset.add("Mississauga");
        
        System.out.println("The Elements in the Hash Set are: "+hset);

        for(String s : hset)
            System.out.println(s.toUpperCase());

        Set<String> tset = new TreeSet<>();
        tset.add("Toronto");
        tset.add("Toronto");
        tset.add("Montreal");
        tset.add("Edmonton");
        tset.add("Vancover");
        tset.add("Mississauga");

        System.out.println("The elements in Tree Set: " + tset);

        List<String> alist = new ArrayList<>();
        alist.add("Toronto");
        alist.add("Toronto");
        alist.add("Montreal");
        alist.add("Edmonton");
        alist.add("Vancover");
        alist.add("Mississauga");

        System.out.println("The Elements in the ArrayList are: " + alist);

        Set<String> linkset = new LinkedHashSet<>();
        linkset.add("Toronto");
        linkset.add("Toronto");
        linkset.add("Montreal");
        linkset.add("Edmonton");
        linkset.add("Vancover");
        linkset.add("Mississauga");

        System.out.println("The elements in Link Set: " + linkset);


        Book book1 = new Book("Introduction", "Xyz", 2000);
        Book book2 = new Book("Introduction to something", "Xyz", 2002);

        Set<Book> bset = new HashSet<>();
        bset.add(book1);
        bset.add(book2);

        System.out.println("THe books are: "+ bset);
*/
        }
}