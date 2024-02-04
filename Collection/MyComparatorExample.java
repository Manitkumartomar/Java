package Collection;

import java.util.Comparator;
import java.util.TreeSet;

// Java Comparator interface is used to order the objects of a user-defined class.

public class MyComparatorExample {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>(new MyComparator());
        for (int i = 1; i <= 10; i++) {
            t.add((int) (Math.random() * 100));
        }
        
        // Printing the TreeSet
        System.out.println("TreeSet elements: " + t);
    }

    static class MyComparator implements Comparator<Integer> {
        public int compare(Integer i1, Integer i2) {
            // Reversing the order, so TreeSet will be in descending order
            return i2.compareTo(i1);
        }
    }
}
