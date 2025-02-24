//Reid Morin
//2-25-25
//CS 240

// Main class to demonstrate AVL Tree traversal
public class AVLTreeExample {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        AVLNode root = null;

        // Insert nodes into the AVL tree
        int[] keys = {10, 20, 30, 40, 50, 25};
        for (int key : keys) {
            root = tree.insert(root, key);
        }

        // Print traversals
        System.out.println("Inorder traversal:");
        tree.inorderTraversal(root);
        System.out.println();

        System.out.println("Preorder traversal:");
        tree.preorderTraversal(root);
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postorderTraversal(root);
        System.out.println();
    }
}
