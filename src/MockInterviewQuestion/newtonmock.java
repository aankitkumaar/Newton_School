package MockInterviewQuestion;

public class newtonmock {

    static Node head;

    static class Node{
        Node next;
        int val;

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
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }

    }
    static boolean loop()
    {
        if(head==null && head.next==head && head.next==null)
        {
            return false;
        }
        Node low = head;
        Node high = head;
        Node curr_node = head;
        while(curr_node!=null && curr_node!=null)
        {
           low = low.next;
           high = high.next.next;
           if(low.next==high.next)
           {
               curr_node.next=null;
               return true;
           }
        }
        return false;

    }

    public static void main(String[] args) {
        newtonmock ob=new newtonmock();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        //ob.add(1);
        ob.print();
        System.out.println();
        boolean temp = ob.loop();
        System.out.println(temp);
        ob.print();

    }
}
