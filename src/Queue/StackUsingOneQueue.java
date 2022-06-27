package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    Queue<Integer> queue = new LinkedList<>();

    public void add(int data)
    {
        int size = queue.size();
        queue.add(data);

        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }
    public int pop()
    {
        if(queue.isEmpty())
            return -1;
      return queue.remove();
    }

    public static void main(String[] args) {
        StackUsingQ stack = new StackUsingQ();
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);


        System.out.println(stack.pop());
    }
}
