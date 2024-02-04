package Collection;

import java.util.Iterator;
//import java.util.Iterator;
import java.util.Stack;
//import java.util.Enumeration;
//import java.util.Vector;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.LinkedList;

public class ListExample {

    public static void main(String[] args) {
        // List<Integer> l = new ArrayList<>();
        // l.add(82);
        // l.add(45);
        // l.add(78);
        // l.add(88);
        // l.add(88);
        // System.out.println(l);
        // System.out.println(l.get(2));
        // System.out.println(l.size());
        // System.out.println(l.indexOf(78));
        // System.out.println(l.remove(3));
        // System.out.println(l.containsAll(l));
        // System.out.println(l.isEmpty());
        // System.out.println(l.set(3,89));
        // System.out.println(l);

        // @SuppressWarnings("rawtypes")
        // ArrayList al = new ArrayList();
        // al.add("Ravi Kumar");
        // al.add(23);
        // al.add('A');
        // al.add(23.5);
        // System.out.println(al);
        // al.add("John");
        // System.out.println(al);

        // LinkedList<String> ll = new LinkedList<>();
        // ll.add("Amit");
        // ll.add("Mohit");
        // ll.add("Sumit");
        // ll.add("Ankit");
        // ll.add("Amit");

        // System.out.println(ll);
        // //Some methods
        // ll.removeLast();
        // System.out.println(ll);
        // ll.addLast("Rohan");
        // System.out.println(ll);
        // ll.addFirst("Shyam");
        // System.out.println(ll);
        // System.out.println(ll.getFirst());
        // ll.pop();
        // System.out.println(ll);
        // ll.poll();
        // System.out.println(ll);
        // ll.push("Ashok");
        // System.out.println(ll);

        // Vector<Integer> v = new Vector<>();
        // System.out.println(v.capacity());
        // for(int i=0;i<=10;i++){
        // v.add((int)(Math.random()*10));
        // }
        // System.out.println(v);

        // Enumeration<Integer> e = v.elements();
        // while (e.hasMoreElements()) {
        // Integer i = (Integer)e.nextElement();
        // if (i%2==0) {
        // System.out.println(i);
        // }
        // }
        // System.out.println("Each time result will be different");
        // System.out.println(v.capacity());

        // Vector<Integer> v = new Vector<>(20);
        // System.out.println(v.capacity());
        // for(int i=1;i<=20;i++){
        //     v.add((int)(Math.random()*10));
        // }
        // System.out.println(v);

        // Iterator<Integer> itr = v.iterator();
        // while (itr.hasNext()) {
        //     Integer i = (Integer)itr.next();
        //     if (i%2==0) {
        //         System.out.println(i);
        //     }
        // } 
        // System.out.println("Each time result will be different");

        // Stack<String> s = new Stack<>();
        // System.out.println(s.capacity());
        // s.add("Jonny");
        // s.add("Henki");
        // s.add("Arjun");
        // s.add("Rahul");
        // System.out.println(s);
        // s.add(2,"Mahesh");
        // s.push("Subham");//In the last
        // System.out.println(s);
        // s.pop();//last out
        // System.out.println(s);
        // System.out.println(s.getClass());

        Stack<Integer> s = new Stack<>();
        for(int i=0;i<=9;i++){
            s.add((int)(Math.random()*10));
        }
        System.out.println(s);
         
        Iterator<Integer> itr = s.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            System.out.println(i);
        } 

    }
}
