package BatchMarch;

import java.util.*;

public class ReverseFirstKElementsInQueue {

    static Queue<Integer> queue=new LinkedList<>();

    public static void reverseMyFirstKElements(int k){

        if(k<0 || k>queue.size()){
            System.out.println("Invalid k");
            return;
        }

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<k;i++){
            stack.push(queue.remove());
        }

        for(int i=0;i<k;i++){
            queue.add(stack.pop());
        }

        for(int i=0;i<queue.size()-k;i++){
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
        int k=10;

        reverseMyFirstKElements(k);

        System.out.println();
        printMyQueue();
    }

}
