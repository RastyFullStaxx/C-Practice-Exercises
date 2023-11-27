public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode root = buildCompleteBinaryTree();

        int nodeCount = countNodes(root);

        System.out.println("Number of nodes in the Complete Binary Tree: " + nodeCount);
    }

    public static int countNodes(TreeNode root) {
        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1; // 2^h - 1
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    public static int leftHeight(TreeNode root) {
        int height = 0;

        while (root != null) {
            height++;
            root = root.left;
        }

        return height;
    }

    public static int rightHeight(TreeNode root) {
        int height = 0;

        while (root != null) {
            height++;
            root = root.right;
        }

        return height;
    }

    public static TreeNode buildCompleteBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        return root;
    }
}
