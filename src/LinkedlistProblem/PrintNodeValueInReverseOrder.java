package LinkedlistProblem;

public class PrintNodeValueInReverseOrder {
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
    static public void print(Node curr)
    {
        if(curr==null) return;
        print(curr.next);
        System.out.print(curr.val+" ");
    }

    static public Node reverse(Node curr)
    {
        Node dummy = null;
        while(curr!=null)
        {
            Node newNode = curr.next;
            curr.next = dummy;
            dummy = curr;
            curr =newNode;
        }
        return dummy;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //print(head);
        Node result = reverse(head);
        print(result);
    }
}
