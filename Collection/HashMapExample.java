package Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
            m.put("John",12);
            m.put("James", 23);
            m.put("James", 23);//Duplicates are not allowed...
            m.put("Anderson", 34);
            m.put("Gadlot", 25);
            m.put("Stark", 28);

            System.out.println(m);
        
            //For iterating...
            for(Map.Entry<String,Integer> s : m.entrySet()) {
                System.out.println(s.getKey()+" : "+s.getValue());
            }
    }
}