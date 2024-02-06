package Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(198, "Vijay");
        map.put(123, "Rahul");
        map.put(111, "Boss");
        map.put(109, "Chaitanya");
        map.put(102, "Deepak");

        // Returns a Set view of the mappings contained in this map
        map.entrySet()
        // Returns a sequential Stream with this collection as its source
        .stream()
        // Sorted according to the provided Comparator
        //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
        
        // Sorted according to the provided Comparator  
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
        // Performs an action for each element of this stream
        .forEach(System.out::println);
    }
}
