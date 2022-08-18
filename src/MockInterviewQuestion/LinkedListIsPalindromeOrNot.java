package MockInterviewQuestion;

import java.util.Stack;

public class LinkedListIsPalindromeOrNot {
    static Node head;
    static Node tail;
    static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next=null;
        }
    }

    static public void add(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    static public void print(){
        //Node curr = head;
        for(Node curr = head;curr!=null;curr = curr.next)
        {
            System.out.print(curr.val+" ");
        }
    }
    static public boolean palindrome()
    {
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();
        while(fast!=null && fast.next!=null)
        {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(stack);
        for(Node curr = slow;curr!=null;curr = curr.next)
        {
            if(stack.pop()!=curr.val)
            {
                return false;
            }
        }
        return true;
    }
    static public void addlast(int val)
    {
        Node newNode = new Node(val);

        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    static public boolean findFirstNodeOfLoopOccuring()
    {
        if(head==null) return false;

        Node slow = head;
        Node fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null) {

            if (slow == fast) return true;

            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void removeLoop()
    {
        if(head==null) return;

        Node slow = head;
        Node fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null) {

            if (slow == fast)
                break;

            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow==fast)
        {
            slow = head;
            if (slow!=fast)
            {
                while(slow.next!=fast.next)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
            }
            else
            {
                while(fast.next!=slow)
                {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            //add(arr[i]);
            addlast(arr[i]);
        }
        head.next.next.next.next.next.next = head.next.next;
        //print();

        System.out.println();
        if(findFirstNodeOfLoopOccuring()) System.out.println("Yes, Having Cycle");
        else System.out.println("No, Not having Cycle");
        removeLoop();
        print();
//        if(palindrome()) System.out.println("Yes");
//        else System.out.println("No");
    }
}
