package Adv_DSA_Batch.Tree;
import java.util.*;
public class Tree {
//preorder
      static class Node
        {
            int data;
            Node left;
            Node right;
            Node(int data)
            {
                this.data = data;
                left=right=null;
            }

        }
        static void printthetree1(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            printthetree1(root.left);
            printthetree1(root.right);
        }
    static void printthetree2(Node root)
    {
        if(root==null)
        {
            return;
        }

        printthetree2(root.left);
        System.out.print(root.data+" ");
        printthetree2(root.right);
    }
    static void printthetree3(Node root)
    {
        if(root==null)
        {
            return;
        }
        //System.out.print(root.data);
        printthetree3(root.left);
        printthetree3(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    printthetree1(root);//preorder
        System.out.println();
        printthetree2(root);//inorder
        System.out.println();
        printthetree3(root);//postorder

    }
}
