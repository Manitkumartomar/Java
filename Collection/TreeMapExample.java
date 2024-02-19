package Java.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(4, "Aman");
        t.put(3, "Bobby");
        t.put(2, "Chetan");
        t.put(1, "Deepak");
        
        for(String i : t.values()){
            System.out.println(i);
        }
        for(Map.Entry<Integer,String> m : t.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
