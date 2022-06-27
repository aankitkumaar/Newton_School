
package LinklistProblem;
import java.util.*;

public class GetValueAtiIndex {

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

    static void print1()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    static void putinLL(int val)
    {
        Node new_Node1 = new Node(val);
        new_Node1.next  = head;
        head = new_Node1;
    }
    public static void main(String[] args) {
        GetValueAtiIndex ob = new GetValueAtiIndex();
        ob.putinLL(2);
        ob.putinLL(2);
        ob.putinLL(2);
        ob.putinLL(2);
        ob.putinLL(2);
        ob.putinLL(2);

        ob.print1();
    }
}
