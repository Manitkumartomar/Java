package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

//Example for Dequeue Interface and ArrayDeque class
//we can add or delete the elements from both the ends.
//ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

public class Queue1 {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        System.out.println(deque);
        deque.addFirst("Arjun");
        deque.addLast("Krishna");
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        deque.offer("abc");//same as add
        System.out.println(deque);
        deque.poll();//Removes first element
        System.out.println(deque);
        deque.pop();//same as poll
        System.out.println(deque);
    }
}
