package Adv_DSA_Batch.Tree;

public class FindTheElementInTree {
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
    static void findtheelement(Node root,int k)
    {
        if(root==null) return;
        if(root.data==k)
        {
            System.out.println("Yes Found it");
        }
        else
        {
            System.out.println("Not Found");
        }

        findtheelement(root.left,k);
        findtheelement(root.right,k);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right  =new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        findtheelement(root,5);
    }
}
