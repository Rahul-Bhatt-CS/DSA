import java.util.*;
public class DSA_2_Queues {
    public static void main(String[] args){

//        Queue is an interface not a class so we need a class that inplements a Queue.
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Rahul");
        queue.offer("Yash");
        queue.offer("Steve");
        queue.offer("Harold");


        System.out.println(queue.isEmpty());

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.contains("Rahul"));

        queue.poll();

        System.out.println(queue);

        System.out.println(queue.peek());
//        We can have 3 methods for queue:
//        offer(e) to add an element to the tail.
//        poll() to remove the element at head.
//        peek() used to get a peek at what is the element at the head.

//        Now we also have some additional methods that we can use as the queue interface extends the Collection class
//        isEmpty() tells if the queue is empty or not
//        size() tells the size of the queue
//        contains(e) this tells if en element is present in the queue or not
    }
}