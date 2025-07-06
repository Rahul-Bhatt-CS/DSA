import java.util.*;

public class DSA_3_PriorityQueues {
    public static void main(String[] args) {
//        Priority Queues:- A Fifo data structure that serves elements
//        with the highest priority first before the element with lower priority.

//        this is the normal queue with no priority
        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

//        Queue interface implemented using a Priority Queue
        Queue<Double> queue2 = new PriorityQueue<>();
        queue2.offer(3.0);
        queue2.offer(2.0);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}