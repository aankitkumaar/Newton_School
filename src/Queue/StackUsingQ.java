package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQ {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void add(int data)
    {
        q1.add(data);
    }
    public int pop()
    {
        while(q1.size()!=1)
        {
            q2.add(q1.remove());
        }
        int temp1 = q1.remove();

        Queue<Integer> temp = q1;
        q1=q2;
        q2=temp;
        return temp1;
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
