package LinkedlistProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveTheDuplicatesFormLinkedList {

    static Node head;

    static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }
    static void add(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }
    static void print(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+"->");
            curr= curr.next;
        }
    }
    static void RemoveTheDuplicates(Node head)
    {
        HashSet<Integer> hashset = new HashSet<>();
        Node curr = head;
        while(curr!=null)
        {
            hashset.add(curr.val);
            curr = curr.next;
        }
        System.out.println();
        for(int data : hashset)
        {
            System.out.print(data+" -> ");
        }
    }

    public static void main(String[] args) {
        RemoveTheDuplicatesFormLinkedList ob= new RemoveTheDuplicatesFormLinkedList();
        ob.add(3);
        ob.add(3);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        //ob.print(head);
        ob.RemoveTheDuplicates(head);

    }
}
