package Collection;
// Set Interface can be instantiated as:

// Set<data-type> s1 = new HashSet<data-type>();  
// Set<data-type> s2 = new LinkedHashSet<data-type>();  
// Set<data-type> s3 = new TreeSet<data-type>();  

// import java.sql.Array;
// import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//HashSet class implements Set Interface.

public class Set {
    public static void main(String[] args) {
        // There are four constructors for HashSet;
        // HashSet<String> h = new HashSet<>();
        // HashSet<String> h = new HashSet<>(0);
        // HashSet<String> h = new HashSet<>(0,0.90f);
        // HashSet<String> h = new HashSet<>(Collection c);

        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add("Amit");
        set.add("Atul");
        System.out.println(set);

        Iterator<String> ltr =  set.iterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }

    }
}
