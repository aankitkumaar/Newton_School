package Adv_DSA_Batch.Tree;

public class DiameterOfTree {
    static int diameterMax = 0;
    static class Node{
        int data;
         Node left;
         Node right;
         Node(int data)
         {
             this.data = data;
             left = right = null;

         }
    }

    //static int leftmax = 0;
    //static int rightmax = 0;
    static int Diameter(Node node,int diameterMax)
    {
       if(node==null) return 0;

       int leftmax = Diameter(node.left,diameterMax);
       int rightmax = Diameter(node.right,diameterMax);

       int temp = Math.max(leftmax,rightmax)+1;
       int ans  = Math.max(temp,leftmax+rightmax+1);
      diameterMax = Math.max(ans,diameterMax);
        return temp;

    }

    static int diameter(Node root)
    {
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }
    static int height(Node node)
    {
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }

    public static void main(String[] args) {
        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right= new Node(7);
        System.out.println(Diameter(root,diameterMax));

    }
}
