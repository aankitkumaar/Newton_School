package LinklistProblem;

import java.util.ArrayList;
import java.util.*;

public class ImplemantionOfLinklist {
    static Node head;

    static class Node
    {
        Node next;
        int val;

        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    static void additem(int val)
    {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

    }
    static void print()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    static void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node prev= head;
       // Node next = null;
        Node curr = head.next;
        while(curr!=null)
        {
            Node nextnode= curr.next;
            curr.next=prev;

            prev = curr;
            curr = nextnode;
        }
        head.next=null;
        head = prev;

    }
    static void swip(int k)
    {
        int count = 1;
        Node curr = head;
        while(curr!=null)
        {
            count++;
            curr= curr.next;
        }
        Node curr1 = head;
        int arr[] = new int[count-1];
        int i=0;
         while(curr1!=null)
         {
             arr[i] = curr1.val;
             curr1 = curr1.next;
             i++;
         }
        System.out.println(Arrays.toString(arr));
         swap(arr,k,count-k-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a,int b)
    {
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }

    public static void main(String[] args) {
        ImplemantionOfLinklist ob = new ImplemantionOfLinklist();
        ob.additem(6);
        ob.print();
        System.out.println();
        ob.additem(8);
        ob.additem(7);
        ob.additem(2);
        ob.additem(9);
        ob.additem(0);
        ob.print();
        System.out.println();
       // ob.reverse();
        ob.swip(2);
    }
}
