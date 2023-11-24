public class NodeDepthInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int targetValue = 3;

        int depth = calculateDepth(root, targetValue, 0);

        if (depth != -1) {
            System.out.println("Depth of the node with value " + targetValue + ": " + depth);
        } else {
            System.out.println("Node with value " + targetValue + " not found in the Binary Tree.");
        }
    }

    public static int calculateDepth(TreeNode root, int targetValue, int currentDepth) {
        if (root == null) {
            return -1;
        }

        if (root.data == targetValue) {
            return currentDepth;
        }

        int leftDepth = calculateDepth(root.left, targetValue, currentDepth + 1);
        int rightDepth = calculateDepth(root.right, targetValue, currentDepth + 1);

        return Math.max(leftDepth, rightDepth);
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
