package LinkedlistProblem;

public class ReverseLinkedListUsingRecursion {
    static Node head;
    static public class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }

    static public void
    rev(Node curr)
    {
        if(curr.next==null)
        {
            head = curr;
            return;
        }
        rev(curr.next);

        Node newNode = curr.next;
        newNode.next = curr;
        curr.next = null;
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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print(head);
        Node curr = head;
        rev(curr);
        print(head);


    }
}
