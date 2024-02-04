package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;


// LinkedHashSet...
// LinkedHashSet class represents the LinkedList implementation of Set Interface.

public class Set1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=1;i<=10;i++){
            set.add((int)(Math.random()*100));
        }
        System.out.println(set);

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Avneesh");//Insertion order is preserved
        set1.add("Komal");
        set1.add("Kapil");
        set1.add("Sonu");
        set1.add("Sonu");//Duplicates are not allowed

        System.out.println(set1);

        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
