package LinkedlistProblem;

import java.util.HashMap;
import java.util.Map;

public class RemoveTheFirstNonRepatingElement {
    static Node head;
    static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
            next = null;
        }
    }

    static void add(int val)
    {
        Node newnode= new Node(val);

        newnode.next = head;
        head = newnode;
    }
    static void print(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val + " ");
            curr= curr.next;
        }
    }
    static Node removeFirstnonRepetElem()
    {
        int NumberThatNeedToRemove = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Node temp = head ; temp!=null;temp = temp.next) {
            if (!map.keySet().contains(temp.val)) {
                map.put(temp.val,0);
            }
            else
            {
                map.put(temp.val,map.get(temp.val)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                NumberThatNeedToRemove = entry.getKey();
                break;
            }
        }
        for(Node curr = head ; curr!=null ;curr = curr.next)
        {
            if(curr.val == NumberThatNeedToRemove)
            {
                curr.next = curr.next.next;
                break;
            }
           // curr = curr.next;
        }
        return head;


       }
    //12 9 11 3 8 9 12
    public static void main(String[] args) {
       RemoveTheFirstNonRepatingElement ob = new RemoveTheFirstNonRepatingElement();
        ob.add(12);
        ob.add(9);
        ob.add(8);
        ob.add(3);
        ob.add(11);
        ob.add(9);
        ob.add(12);
        ob.print(head);
        Node result =  ob.removeFirstnonRepetElem();
        System.out.println();
        ob.print(result);

    }
}
