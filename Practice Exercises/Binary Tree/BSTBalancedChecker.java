public class BSTBalancedChecker {
    public static void main(String[] args) {
        TreeNode root = buildBalancedBST();
        boolean isBalanced = isBalanced(root);

        if (isBalanced) {
            System.out.println("The BST is balanced.");
        } else {
            System.out.println("The BST is not balanced.");
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return getHeightAndCheckBalanced(root) != -1;
    }

    private static int getHeightAndCheckBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeightAndCheckBalanced(root.left);
        if (leftHeight == -1) {
            return -1; // Left subtree is unbalanced
        }

        int rightHeight = getHeightAndCheckBalanced(root.right);
        if (rightHeight == -1) {
            return -1; // Right subtree is unbalanced
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current subtree is unbalanced
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static TreeNode buildBalancedBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        return root;
    }
}
