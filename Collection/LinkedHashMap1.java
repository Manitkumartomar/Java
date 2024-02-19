package Java.Collection;

import java.util.*;

public class LinkedHashMap1 {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        hm.put(103, "Shubham");
        hm.put(104, "Akshay");
        hm.put(105, "Puneet");

        System.out.println("Key-Set: " + hm.keySet());
        System.out.println("Value-Set: " + hm.values());
        System.out.println("Key-Value Pair: " + hm.entrySet());

        //After removing an element by key
        hm.remove(102);
        System.out.println("After removing: "+hm);

    }
}