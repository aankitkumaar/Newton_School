package BatchMarch;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {


    //      ->  x789   ->
    // 3
    Queue<Integer> queue=new LinkedList<>();

    public void add(int data){ // it will add in such a way that removal element will become LIFO

        int size=queue.size();// newsize-1
        queue.add(data);
        for(int i=0;i<size;i++){
            queue.add(queue.remove());
        }

    }

    public int pop(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty, nothing to remove");
            return -1;
        }
        return queue.remove();
    }

    public static void main(String[] args) {

        StackUsingOneQueue stack=new StackUsingOneQueue();
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);

        System.out.println(stack.pop());




    }
}
