public class BFSTree {
    public static Node head;
    static public class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data =data;
            left= right = null;
        }
    }

    public static void BSF(Node head)
    {
        int height = FindHeight(head);
        System.out.println("Height->"+height);
        for (int i = 1; i <=height; i++) {
            Print(head,i);
        }
    }

    public static void Print(Node head, int atlevel)
    {
        if(head==null) return;
        if(atlevel==1) System.out.print("->"+head.data);

        Print(head.left,atlevel-1);
        Print(head.right,atlevel-1);
    }

    public static int FindHeight(Node head)
    {
        if(head==null) return 0;

        int left  = FindHeight(head.left);
        int right = FindHeight(head.right);

        if(left>right) return left+1;
        else return right+1;
    }
    public static void main(String[] args) {
        BFSTree ob = new BFSTree();
        ob.head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        //ob.print(head);
        ob.BSF(head);
    }
}
