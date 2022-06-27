public class mock2 {

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

    static void push(int val)
    {
        Node new_Node = new Node(val);
        new_Node.next = head;
         head = new_Node;
    }


    static void print(Node head)
    {
        Node curr = head;

        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
    }

    //45 35 25 5
    static void rever()
    {
        Node curr = null;
        Node prev = null;
        Node Next =head;

        while(Next!=null)
        {
            curr = Next.next;
            Next.next=prev;
            prev = Next;
            Next=curr;
        }
        head = prev;
    }

    public static void main(String[] args) {
        mock2 ob = new mock2();
        ob.push(5);
        ob.push(25);
        ob.push(35);
        ob.push(45);


        ob.print(head);

        ob.rever();
        System.out.println();
        ob.print(head);



    }
}
