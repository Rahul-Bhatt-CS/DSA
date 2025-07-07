import java.util.*;
public class DSA_4_LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

//        this is linked list as a stack
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");
        list.pop();

        System.out.println(list);

//        this is linked list as a queue
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("F");
        list.poll();

        System.out.println(list);

//        these are so good at inserting and deleting in between.

        list.add(7, "E");
        list.remove("F");

//        we can also find the index of any element:
        System.out.println(list.indexOf("E"));

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.addFirst("0");
        list.addLast("G");
        String first = list.removeFirst();
        String last = list.removeLast();

        System.out.println(list);
        System.out.println(list.size());

    }
}