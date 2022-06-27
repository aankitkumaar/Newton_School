package LinklistProblem;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseTheLinkedList {


    static void reverse()
    {}


    public static void main(String[] args) {
        ReverseTheLinkedList ob =new  ReverseTheLinkedList();
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(78);
        ll.add(98);
        ll.add(90);
        ll.add(99);
        ll.add(100);
        Stack<Integer> rever = new Stack<>();
        while(!ll.isEmpty())
        {
            rever.add(ll.remove());
        }
        //ll.reverse();
        System.out.println(rever);
    }
}
