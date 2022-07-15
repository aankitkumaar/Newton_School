package QueueProblem;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava
{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(5);
        queue.add(13);
        queue.add(15);



        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
