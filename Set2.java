package Collections;
// SortedSet Interface...
// SortedSet is the alternate of Set interface that provides a total ordering on its elements.
// The SortedSet can be instantiated as: SortedSet<data-type> set = new TreeSet();  

import java.util.TreeSet;

// TreeSet...

public class Set2 {
    public static void main(String[] args) {
        // Constructors for TreeSet...
        // TreeSet t = new TreeSet();
        // TreeSet t = new TreeSet(Comparator c);
        // TreeSet t = new TreeSet(SortedSet s);
        // TreeSet t = new TreeSet(Collection c);

        TreeSet<Integer> t = new TreeSet<>();
        for(int i=1;i<=10;i++){
            t.add((int)(Math.random()*100));
        }
        System.out.println(t);// All numbers will be printed in ascending order...

        TreeSet<String> t1 = new TreeSet<>();
        t1.add("Bonny");
        t1.add("Annu");
        t1.add("Sintu");
        t1.add("Zonny");
        t1.add("Sony");
        t1.add("Tony");
        
        System.out.println(t1);// Print in alphabetical order...
    }
}
