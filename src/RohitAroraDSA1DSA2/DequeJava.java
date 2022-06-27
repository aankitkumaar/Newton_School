package BatchMarch;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
//->       ->
//<-       <-




public class DequeJava {

    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();
        deque.addLast("Danish");
        deque.addFirst("Salil");
        deque.add("Jitesh");

        System.out.println(deque);

        ArrayList<String > list=new ArrayList<>();
        list.add("Gattu");
        list.add("Jyoti");

        deque.addAll(list);

        System.out.println(deque);


     //   System.out.println(deque.removeFirst());
      //  System.out.println(deque.removeLast());
       // System.out.println(deque.remove());

        System.out.println(deque);

        System.out.println(deque.size());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.isEmpty());



    }
}
