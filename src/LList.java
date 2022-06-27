public class LList {
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
            System.out.print(curr.val+ " ");
            curr= curr.next;
        }
    }
    static void reverse()
    {
        Node prev = head;
        Node curr = head.next;

        while(curr!=null)
        {
            Node new_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr= new_node;
        }
        head.next = null;
        head = prev;
    }
    static int middle()
    {
        //int count = 0;
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            //count ++;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        LList ob = new LList();
        ob.add(12);
        ob.add(22);
        ob.add(32);
        ob.add(42);
        ob.print();
        ob.reverse();
        System.out.println();
        ob.print();
        System.out.println();
        System.out.println(ob.middle());

    }
}
