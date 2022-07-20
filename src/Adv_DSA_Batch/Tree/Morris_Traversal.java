package Adv_DSA_Batch.Tree;
import java.util.*;
import java.io.IOException;
public class Morris_Traversal {

    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
            left=right=null;

        }
    }

    static List<Integer> inOrderMorris(Node node){
        List<Integer> inOrder = new ArrayList<>();
        Node curr = node;
        while(curr != null){
            if(curr.left == null){
                inOrder.add(curr.data);
                curr = curr.right;
            }else{
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }

                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    inOrder.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return inOrder;
    }
    public static void main(String[] args) throws IOException {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.left.right.right = new Node(7);

        List<Integer> result = inOrderMorris(root);

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i)+" ");
        }

    }
}