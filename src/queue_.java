import java.util.*;
public class queue_ {
    public static void main(String[] args){
        // queue works on FIFO -First IN FIRST OUT basis
        /* queue is a collection designed for holding elements prior to processing linear data structures
        enqueue- adding an object to the end of the tail in a queue
        dequeue-removing an object from the head of the queue

        Queue<String> queue=new Queue<String>();(doesnt work in a class because queue is an interface)
        hence we will use a linkedlist to implement queue
         */
        Queue<String> queue= new LinkedList<>();
        /* queue methods
           1.) offer() - adds value after the tail(enqueue);
           2.) poll() - removes value at the head currently(dequeue);
           3.) peek() - returns value at the head;
           4.) isEmpty() - checks if queue is empty returns true or false;
           5.) size() - returns the size of the queue(length);
           6.) contains() - returns true or false is val is present in queue(does NOT return index)
         */
        queue.offer("Luffy");
        queue.offer("Zoro");
        queue.offer("Sanji");
        queue.offer("robin");
        queue.offer("nami");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Sanji"));
    }
}
