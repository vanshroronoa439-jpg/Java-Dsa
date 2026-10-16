import java.util.*;
public class priority_queue{
    public static void main(String[] args){
        /* A FIFO data structure that serves elements with the highest priorities first
           Automatically arranges queue in ascending order when you define a priority queue
           Queue<Double> queue= new PriorityQueue<>(Collections.reverseOrder());
           use this to print or turn the queue in descending order
         */
        Queue<String> queue= new PriorityQueue<>();
        queue.offer("A");
        queue.offer("N");
        queue.offer("M");
        queue.offer("a");
        queue.offer("B");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}