package Adv_DSA_Batch.Tree;


public class HightOfTree {
    static int sum =0;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            right = left = null;
        }
    }
    static int findHight(Node node)
    {
        if(node==null) return -1;

        return Math.max(findHight(node.left),findHight(node.right))+1;
    }

    static void levelordertravelsal(Node node, int level)
    {
        if(node==null) return;
        for (int i = 1; i <=level; i++) {
           doPrintelement(node,i);
            System.out.println();
        }
    }

    static void doPrintelement(Node node, int level)
    {
        if(node==null) return;
        if(level == 1) {
            System.out.print(node.data + " ");
            sum+=node.data;
            return;
        }
        doPrintelement(node.left,level-1);
        doPrintelement(node.right,level-1);
    }

    public static void main(String[] args) {
        HightOfTree ob = new HightOfTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right  =new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //root.left.left.left = new Node(8);
        int level = ob.findHight(root)+1;
        System.out.println("Hight of tree : "+ob.findHight(root));
        //System.out.println(ob.findHight(root));
        System.out.println("Level of tree : " + (ob.findHight(root)+1));
        levelordertravelsal(root,level);
        System.out.println(sum);

    }

}
