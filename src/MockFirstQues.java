


/*Reverse a Linked List in groups of given size

        Example:

        Input: 1->2->3->4->5->6->7->8->NULL, K = 3

        Output: 3->2->1->6->5->4->8->7->NULL

        Input: 1->2->3->4->5->6->7->8->NULL, K = 5

        Output: 5->4->3->2->1->8->7->6->NULL*/

import java.util.Scanner;

public class MockFirstQues {

    static Node head;

    static class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }

    static void add(int val)
    {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

    }
    static void print()
    {
        Node curr =head;
        while(curr!=null)
        {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
    static int lengthofll()
    {
        Node curr = head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static void rever()
    {
        Node prev = head;
        Node curr = head.next;
        while(curr!=null )
        {
            Node new_node = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = new_node;
        }
        head.next = null;
        head = prev;
    }
    public static void main(String[] args) {
        MockFirstQues ob = new MockFirstQues();
        Scanner ob2 = new Scanner(System.in);
        int k = ob2.nextInt();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        ob.add(8);
        ob.print();
        int length = ob.lengthofll();
        //ob.reveruptok(length,k);


    }
}
