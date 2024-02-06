package Collection;

import java.util.HashMap;

//Java HashMap example to remove() elements

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Anil", 102);
        hm.put("Pooja", 111);
        hm.put("Abhinav", 123);
        hm.put("Komal", 231);

        System.out.println("Initial list: "+hm);
        //Key-based removal
        hm.remove("Pooja");
        System.out.println("Updated list: "+hm);
        //Key-Value based removal
        hm.remove("Anil", 102);
        System.out.println("Updated list: "+hm);
    }
}
