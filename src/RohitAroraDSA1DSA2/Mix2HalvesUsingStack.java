package BatchMarch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mix2HalvesUsingStack {

   static Queue<Integer> queue=new LinkedList<>();

   public static void mixTheTwoHalves(){

       int size=queue.size(); //8
       if (size % 2 != 0) {
           System.out.println("Queue is not having even number of elements");
           return;
       }

       int half=size/2; //4

       Stack<Integer> stack=new Stack<>();

       for(int i=0;i<half;i++){
           stack.push(queue.remove());
       }

       for(int i=0;i<half;i++){
           queue.add(stack.pop());
       }

       for(int i=0;i<half;i++){
           queue.add(queue.remove());
       }

       for(int i=0;i<half;i++){
           stack.push(queue.remove());
       }

       for(int i=0;i<half;i++){
           queue.add(stack.pop());
           queue.add(queue.remove());
       }

   }

    public static void printMyQueue(){// iterator/ foreach
        for (Integer integer : queue) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        queue.add(10);
        queue.add(15);
        queue.add(57);
        queue.add(43);
        queue.add(19);
        queue.add(33);
        queue.add(20);
        queue.add(40);

        printMyQueue();

        mixTheTwoHalves();

        System.out.println();
        printMyQueue();    // 10 19 15 33 57 20 43 40
    }

}
