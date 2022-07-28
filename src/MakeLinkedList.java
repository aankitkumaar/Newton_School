

//input: 2 -> 3 -> 4 -> 5 -> 6 -> null, k = 2
//
//        output: 3 -> 2 -> 5 -> 4 -> 6 -> null
import java.util.*;
public class MakeLinkedList {
static Node head;
    static class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            next=null;
        }
    }

    /*static void reverse(LinkedList<Integer> list,int k)
    {
        int lenght = list.size();
        for (int i = 0; i < lenght; i++) {
             if(i%k==0)
             {
                 int left = i;
                 int right =
             }
        }
    }*/

    static void add(int val)
    {
        Node new_Node = new Node(val);

        new_Node.next = head;
        head = new_Node;
    }

    static void reverse(int k)
    {
        int count = 0;
        Node prev = head;
        Node curr = head;
        while(curr!=null)
        {
            count++;
            curr = curr.next;

            // count 1 2
            // ll 2 3 4 5 6
            // k 2

            if(count%k==0)
            {

            }

        }
    }

    static void print(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
       MakeLinkedList ob = new MakeLinkedList();
       // LinkedList<Integer> list = new LinkedList<>();
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        int  k  = 2;
        ob.print(head);
        ob.reverse(k);
        ob.print(head);



    }

}
