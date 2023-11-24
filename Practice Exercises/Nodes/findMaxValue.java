public class MaxValueInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int maxValue = findMaxValue(root);

        System.out.println("Maximum value in the Binary Tree: " + maxValue);
    }

    public static int findMaxValue(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMaxValue(root.left);
        int rightMax = findMaxValue(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
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
