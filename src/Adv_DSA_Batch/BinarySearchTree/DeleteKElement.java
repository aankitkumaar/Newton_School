package Adv_DSA_Batch.BinarySearchTree;

public class DeleteKElement {
    static class Node
        {
            int data;
            Node left, right;
        }

        // A utility function to create a new BST node
        static Node newNode(int item)
        {
            Node temp = new Node();
            temp.data = item;
            temp.left = temp.right = null;
            return temp;
        }

        // A utility function to do inorder traversal of BST
        static void inorder(Node root)
        {
            if (root != null)
            {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        // A utility function to insert a new node
// with given key in BST
        static Node insert(Node node, int key)
        {

            // If the tree is empty, return a new node
            if (node == null)
                return newNode(key);

            // Otherwise, recur down the tree
            if (key < node.data)
                node.left = insert(node.left, key);
            else
                node.right = insert(node.right, key);

            // Return the (unchanged) node pointer
            return node;
        }

        // Given a binary search tree and a key, this
// function deletes the key and returns the
// new root
        static Node deleteNode(Node root, int k)
        {
            if (root == null)
                return root;
            if (root.data > k)
            {
                root.left = deleteNode(root.left, k);
                return root;
            }
            else if (root.data < k)
            {
                root.right = deleteNode(root.right, k);
                return root;
            }
            if (root.left == null)
            {
                Node temp = root.right;
                return temp;
            }
            else if (root.right == null)
            {
                Node temp = root.left;
                return temp;
            }
            else
            {
                Node succParent = root;
                Node succ = root.right;

                while (succ.left != null)
                {
                    succParent = succ;
                    succ = succ.left;
                }
                if (succParent != root)
                    succParent.left = succ.right;
                else
                    succParent.right = succ.right;
                root.data = succ.data;

                return root;
            }
        }

        // Driver Code
        public static void main(String args[])
        {

	/* Let us create following BST
		50
		/	 \
	30	 70
	/ \ / \
	20 40 60 80 */
            Node root = null;
            root = insert(root, 50);
            root = insert(root, 30);
            root = insert(root, 20);
            root = insert(root, 40);
            root = insert(root, 70);
            root = insert(root, 60);
            root = insert(root, 80);

            System.out.println("Inorder traversal of the " +
                    "given tree");
            inorder(root);

            System.out.println("\nDelete 20\n");
            root = deleteNode(root, 20);
            System.out.println("Inorder traversal of the " +
                    "modified tree");
            inorder(root);

            System.out.println("\nDelete 30\n");
            root = deleteNode(root, 30);
            System.out.println("Inorder traversal of the " +
                    "modified tree");
            inorder(root);

            System.out.println("\nDelete 50\n");
            root = deleteNode(root, 50);
            System.out.println("Inorder traversal of the " +
                    "modified tree");
            inorder(root);
        }
    }