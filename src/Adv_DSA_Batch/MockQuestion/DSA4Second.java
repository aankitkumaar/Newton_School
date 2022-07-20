package Adv_DSA_Batch.MockQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class DSA4Second {
    static int height = 0;
    static int sumofleaf = 0;
    static int longestLength = 0;
    static class Node
    {
        int val;
        Node left,right;
        Node(int val)
        {
            this.val = val;
            left=right=null;
        }
    }
    static public void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static public int findHight(Node root)
    {
        if(root==null) return 0;

        int left = findHight(root.left);
        int right = findHight(root.right);

        height = Math.max(left,right)+1;

        return height;
    }
    static public int sumOfleafNode(Node root,int sum)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        int left =  sumOfleafNode(root.left,sum);
        int right = sumOfleafNode(root.right,sum);

       return sum+left+right;
    }
    static public void levelOrder(Node root)
    {
        if(root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if(!queue.isEmpty())
        {
            Node temp = queue.poll();
            System.out.print(temp.val+" ");
            if(temp.left!=null)
            {
                levelOrder(root.left);

            }
            if(temp.right!=null)
            {
                levelOrder(root.right);

            }
        }
    }
    static int longestpath(Node root)
    {

        if(root==null) return 0;
        int left = longestpath(root.left);
        int right = longestpath(root.right);
        longestLength =  Math.max(left,right)+1;

        return 1;

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        //root.right.left= new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
       // inorder(root);
       /* System.out.println();
        System.out.println(findHight(root));
        System.out.println(sumOfleafNode(root,0));
        levelOrder(root);*/
        longestpath( root);


    }
}


