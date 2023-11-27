public class MaxPathSumBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int maxPathSum = findMaxPathSum(root);

        System.out.println("Maximum Path Sum in the Binary Tree: " + maxPathSum);
    }

    private static int findMaxPathSum(TreeNode root) {
        int[] result = new int[]{Integer.MIN_VALUE};
        findMaxPathSumUtil(root, result);
        return result[0];
    }

    private static int findMaxPathSumUtil(TreeNode root, int[] result) {
        if (root == null) {
            return 0;
        }

        int leftMax = Math.max(findMaxPathSumUtil(root.left, result), 0);
        int rightMax = Math.max(findMaxPathSumUtil(root.right, result), 0);

        int currentSum = root.data + leftMax + rightMax;
        result[0] = Math.max(result[0], currentSum);

        return root.data + Math.max(leftMax, rightMax);
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        return root;
    }
}
