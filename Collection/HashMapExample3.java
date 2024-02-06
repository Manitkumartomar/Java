package Collection;

import java.util.HashMap;
import java.util.Map;

//Java HashMap example to replace() elements
//different ways to replace elements.

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(24, "Keshav");
        hm.put(23, "Suresh");
        hm.put(45, "Akhil");
        hm.put(46, "Surendra");
        hm.put(19, "Hemant");

        System.out.println("Initial list of elements...");
        for(Map.Entry<Integer,String> m : hm.entrySet()){
            System.out.println(m.getValue()+" : "+m.getKey());
        }

        System.out.println("Updated list of elements...");
        hm.replace(46, "kuldeep");
        for(Map.Entry<Integer,String> m : hm.entrySet()){
            System.out.println(m.getValue()+" : "+m.getKey());
        }

        System.out.println("Updated list of elements...");
        hm.replace(23, "Suresh","Rahul");
        for(Map.Entry<Integer,String> m : hm.entrySet()){
            System.out.println(m.getValue()+" : "+m.getKey());
        }

        System.out.println("Updated list of elements...");
        hm.replaceAll((k,v)-> "Names");;
        for(Map.Entry<Integer,String> m : hm.entrySet()){
            System.out.println(m.getValue()+" : "+m.getKey());
        }


    }
}
