package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

//Queue is the child interface of Collection
//It has Priority class and Deque child Interface which has ArrayDeque class

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("Head: "+queue.element());
        System.out.println("Head: "+queue.peek());
        System.out.println();
        System.out.println("Iterating the queue elements");

        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements...");

        Iterator<String> itr1 = queue.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}
