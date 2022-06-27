package BatchMarch;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {

    // Collection -> Queue -> Deque  -> LinkedList
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.add(3);
        queue.add(34);
        queue.add(22);
        queue.add(67);

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.peek());
    }


}
