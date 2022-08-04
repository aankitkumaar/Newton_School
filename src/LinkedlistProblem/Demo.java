package LinkedlistProblem;

import java.util.LinkedList;

public class Demo {

    static Node head;

    static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next= null;
        }
    }
    static void add(int val)
    {
        Node newNode = new Node(val);

        newNode.next= head;
        head = newNode;
    }
    static void print()
    {
        int count =0;
        //Node curr = head;
//        while(curr!=null)
//        {
//            System.out.println(curr.val+" ->");
//            curr = curr.next;
//        }
        for(Node curr = head;curr!=null;curr=curr.next)
        {
            count++;
            System.out.print(curr.val+" -> ");
        }
        System.out.println(count);
    }
    static void delete(int temp)
    {
        Node curr = head;
        Node prev ;
        while (curr!=null)
        {
            prev = curr;
            curr=curr.next;
            if(curr.val==temp)
            {
                prev.next=curr.next;
                break;
            }

        }

    }


    //1 2 3 4 5 6
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        print();
        delete(5);
        System.out.println();
        print();


    }
}
