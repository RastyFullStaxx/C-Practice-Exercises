import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Binary Tree:");
        printTree(root);
        List<List<Integer>> levelOrder = levelOrderTraversal(root);
        System.out.println("Level Order Traversal: " + levelOrder);
    }

    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        // Implement a method to perform level order traversal of a binary tree
        return null;
    }

    private static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }
}
