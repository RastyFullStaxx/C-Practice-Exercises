public class MinValueInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int minValue = findMinValue(root);

        System.out.println("Minimum value in the Binary Tree: " + minValue);
    }

    public static int findMinValue(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = findMinValue(root.left);
        int rightMin = findMinValue(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
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
