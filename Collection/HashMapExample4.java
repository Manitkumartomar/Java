package Collection;

import java.util.HashMap;
import java.util.Map;

//Java HashMap Example: Book

class Book{
    int id;
    String name,author,publisher;
    int quantity;
    Book(int id,String name,String author,String publisher,int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashMapExample4 {
    public static void main(String[] args) {
        HashMap<Integer,Book> hm = new HashMap<>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        hm.put(1, b1);
        hm.put(2, b2);
        hm.put(3, b3);

        for(Map.Entry<Integer,Book> m : hm.entrySet()){
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println("Book "+key+" Details...");
            System.out.println(b.id+" : "+b.name+" : "+b.author+" : "+b.publisher+" : "+b.quantity);
        }
    }
}
