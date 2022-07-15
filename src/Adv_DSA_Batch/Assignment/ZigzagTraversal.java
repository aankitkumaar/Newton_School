package Adv_DSA_Batch.Assignment;
import java.util.*;
public class ZigzagTraversal {

    //7 7 9 8 8 6 N 10 9 --Input
    //7 9 7 8 8 6 9 10  --output
    static ArrayList<Integer> list = new ArrayList<>();
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data= data;
            left=right=null;
        }
    }
    static ArrayList<Integer> zigzagTraversal(Node root){
            Queue<Node> queue = new LinkedList<>();
            //ArrayList<Integer> list = new ArrayList<>();

            if(root == null) return list;

            queue.offer(root);
            boolean flag = true;

            while(!queue.isEmpty()){

                int level = queue.size();
                //ArrayList<Integer> subList = new ArrayList<>(level);
                //iterate over all the element at this level//
                for(int i = 0; i < level; i++){
                    if(queue.peek().left != null) queue.offer(queue.peek().left);
                    if(queue.peek().right != null) queue.offer(queue.peek().right);

                    if(flag) list.add(0, queue.poll().data);
                    else
                        list.add(queue.poll().data);

                }
                flag = !flag;
                //list.add(subList);
            }
            return list;
        }
        public static void main(String[] args) {
            Node root = new Node(3);
            root.left = new Node(2);
            root.right = new Node(1);
            /*root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);*/

          ArrayList<Integer> answer = zigzagTraversal(root);

            System.out.println("Zig-Zag traversal of Binary Tree ");
            System.out.println(answer);
        }
    }