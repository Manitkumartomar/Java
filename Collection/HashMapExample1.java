package Collection;

import java.util.HashMap;
import java.util.Map;

//Java HashMap example to add() elements

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Keshav", 24);
        hm.put("Suresh", 23);
        hm.put("Akhil", 45);
        hm.put("Surendra", 46);
        hm.put("Hemant", 19);

        System.out.println("After invoking put method...");
        for(Map.Entry<String,Integer> m:hm.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        hm.putIfAbsent("Honey", 29);
        System.out.println("After invoking putIfAbsent method...");
        for(Map.Entry<String,Integer> m:hm.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ankit", 25);
        map.putAll(hm);
        System.out.println("After invoking putAll method...");
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
