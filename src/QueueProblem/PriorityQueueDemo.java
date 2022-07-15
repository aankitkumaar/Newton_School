package QueueProblem;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(30);
        queue.add(10);
        queue.add(40);
        queue.add(30);
        queue.add(450);
        queue.add(100);
        queue.add(44440);
        queue.add(36660);
        //queue.peek();
        System.out.println(queue);


    }
}
