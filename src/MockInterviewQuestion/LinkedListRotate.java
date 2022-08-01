package MockInterviewQuestion;

public class LinkedListRotate {
    static Node head;
    //static Node alltime = hea

    static class Node
    {
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    static void add(int val)
    {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    static void Rotate(Node head, int k)
    {
        int count=0;
        Node curr = head;
        while(curr!=null)
        {
            count++;
            curr  = curr.next;
        }
        Node prev = head;
        Node currr = head.next;

        for (int i = 0; i < count; i=i+k) {
              //k==3
            while(k-->0)
            {
                Node newNode = currr.next;
                currr.next = prev;
                prev = currr;
                curr = newNode;
            }
            prev = currr;
        }

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

    public static void main(String[] args) {
        LinkedListRotate ob = new LinkedListRotate();
        //[1,2,3,4,5,6,7,8
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        int k = 3;
        ob.Rotate(head,k);
        ob.print();


    }
}
