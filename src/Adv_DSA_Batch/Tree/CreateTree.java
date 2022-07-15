package Adv_DSA_Batch.Tree;
import java.util.*;

public class CreateTree {
    static Node root;
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
       CreateTree ob =new CreateTree();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Node root = null;
       ob.root = ob.CreateTreeUsingArray(arr, 0);
        ob.inorderPrint(ob.root);

    }

    public static Node CreateTreeUsingArray(int[] arr, int i) {
        Node root = null;
        if(i < arr.length) {
            root = new Node(arr[i]);
            root.left= CreateTreeUsingArray(arr, 2 * i + 1);
            root.right = CreateTreeUsingArray(arr, 2 * i + 2);
        }
        return root;
    }
    public static void inorderPrint(Node root)
    {
        if(root==null) return;
        inorderPrint(root.left);
        System.out.println(root.data);
        inorderPrint(root.right);
    }
}


   /* static Node root;

// Tree Node
static class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
    public Node insertLevelOrder(int[] arr, int i)
    {
        Node root = null;
        if (i < arr.length) {
            root = new Node(arr[i]);
            root.left = insertLevelOrder(arr, 2 * i + 1);
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
*/
/*package Adv_DSA_Batch.Tree;
        import java.util.*;

public class CreateTree {
    static Node root;

    // Tree Node
    static class Node {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node insertLevelOrder(int[] arr, int i)
    {
        Node root = null;
        if (i < arr.length) {
            root = new Node(arr[i]);
            root.left = insertLevelOrder(arr, 2 * i + 1);
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        CreateTree t2 = new CreateTree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        t2.root = t2.insertLevelOrder(arr, 0);
        t2.inOrder(t2.root);
    }
}*/

