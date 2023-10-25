package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        //QUEUE = FIFO data structures. First-In First Out
        // A collection designed for holding elements prior to processing Linear data structure

        // add       = enqueue , offer();
        // remove    = dequeue , poll();

        
        queue.offer("Nattu");  //add into queue        HEAD
        queue.offer("raja");
        queue.offer("subash");                        //TAIL
        
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Nattu"));
        System.out.println(queue.size());

        // QUEUE uses ?
        // 1. Keyboard buffer(letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists , PriorityQueues , Breadth-first Search
    }

}