class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Binary Tree:");
        printTree(root);
        int maxDepth = maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: " + maxDepth);
    }

    public static int maxDepth(TreeNode root) {
        // Implement a method to find the maximum depth of a binary tree
        return 0;
    }

    private static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }
}
