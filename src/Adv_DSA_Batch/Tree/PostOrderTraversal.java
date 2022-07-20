/*
package Adv_DSA_Batch.Tree;

import java.util.*;

public class PostOrderTraversal {
    static Node root;
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
//    public static void main (String[] args) {
//        PostOrderTraversal ob2 = new PostOrderTraversal();
//        Scanner ob = new Scanner(System.in);
//        int tc = ob.nextInt();
//        int[] arr = new int[tc];
//        arr[0] = 1;
//        for(int i=1;i<tc;i++)
//        {
//            arr[i] = ob.nextInt();
//        }
//        Node root = CreateTreeUsing(arr,0);
//        ob2.postorder(root);
//    }
//    public static Node CreateTreeUsing(int[] arr, int i) {
//        Node root = null;
//        if(i < arr.length) {
//            root = new Node(arr[i]);
//            root.left = CreateTreeUsing(arr, 2 * i + 1);
//            root.right = CreateTreeUsing(arr, 2 * i + 2);
//        }
//        return root;
//    }
//
//
//    }*/
