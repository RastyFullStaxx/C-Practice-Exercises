public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int maxDepth = findMaxDepth(root);

        System.out.println("Maximum depth of the Binary Tree: " + maxDepth);
    }

    public static int findMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        return root;
    }
}
