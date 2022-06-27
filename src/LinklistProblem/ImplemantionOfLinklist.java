package LinklistProblem;

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
        ob.reverse();
        ob.print();
    }
}
