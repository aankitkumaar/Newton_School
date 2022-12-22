package AAMock;

import java.util.Scanner;

public class LinkedList {
    static Node head;
    static public class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next=null;
        }
    }

    static public void addinList(int val)
    {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    static public void print(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }

    public static Node reverse(Node head)
    {
       Node newNode = null;
       while(head!=null)
       {
           // 1 3 4 6
           Node Nodenew = head.next;
           head.next = newNode;
           newNode = head;
           head = Nodenew;
       }
       return newNode;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        for (int i = 0; i < n; i++) {
            addinList(arr[i]);
        }
        print(head);

        System.out.println();
        Node temp = reverse(head);
        print(temp);
    }
}
