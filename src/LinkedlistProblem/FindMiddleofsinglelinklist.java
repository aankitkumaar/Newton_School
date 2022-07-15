package LinkedlistProblem;

public class FindMiddleofsinglelinklist {

    static Node head;

     static class Node
    {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;

        }

    }

    public static void addelement(int val)
    {
        Node new_node = new Node(val);

        new_node.next = head;
        head=new_node;
    }

    public static void printlinkedlist()
    {
        Node curr = head;

        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }

    public static int findmiddle()
    {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        System.out.println(slow.val+" this is middle of the element"+" " + count);
        return count;

    }

    static void islooppresentofnot(Node head)
    {
        Node slowpointer = head;
        Node fastpointer = head;
        int count =0;
        boolean flag = false;
        while(slowpointer!=null && fastpointer!=null && fastpointer.next!=null)
        {
           slowpointer= slowpointer.next;
           fastpointer = fastpointer.next.next;
            if(slowpointer==fastpointer)
            {
                rempvetheloop(slowpointer,head);
                System.out.println("loop present");
                flag = true;
                break;
            }

        }
        System.out.println((flag==true)?true:false);


    }


    static void rempvetheloop(Node slowpointer, Node head)
    {
        slowpointer = head;
        while(slowpointer.next!=null)
        {
            slowpointer = slowpointer.next;
        }

        slowpointer.next = null;


    }

    static Node removethemiddlelement(int k)

    {

        Node curr = head;
        Node prev = null;

        while(k>1)
        {
            curr = curr.next;
            k--;
        }
        curr.next = curr.next.next;
        return head;

    }




    public static void main(String[] args) {
        FindMiddleofsinglelinklist ob= new FindMiddleofsinglelinklist();

       /* ob.addelement(2);
        ob.addelement(6);
        ob.addelement(4);
        ob.addelement(5);
        ob.addelement(7);
        ob.addelement(8);
        ob.addelement(29);*/

        ob.head = new Node(6);
        ob.head.next = new Node(16);
        ob.head.next.next = new Node(26);
        ob.head.next.next.next = new Node(36);
        ob.head.next.next.next.next = new Node(56);
        ob.head.next.next.next.next.next = new Node(66);
       // ob.head.next.next.next.next.next = ob.head.next;

        ob.addelement(69);
        ob.printlinkedlist();
        int indexofmiddeleelement = ob.findmiddle();
        head = ob.removethemiddlelement(indexofmiddeleelement);
        //head = ob.makeloop(head,3);
        //System.out.println(head);
        //ob.islooppresentofnot(head);
        //ob.printlinkedlist(head);
        ob.printlinkedlist();


       // System.out.println(head);

    }
}
