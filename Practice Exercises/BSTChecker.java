public class BSTChecker {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        boolean isBST = isBST(root);

        if (isBST) {
            System.out.println("The tree is a Binary Search Tree.");
        } else {
            System.out.println("The tree is not a Binary Search Tree.");
        }
    }

    public static boolean isBST(TreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(TreeNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }

        if (root.data <= minValue || root.data >= maxValue) {
            return false;
        }

        return isBSTUtil(root.left, minValue, root.data) && isBSTUtil(root.right, root.data, maxValue);
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        return root;
    }
}
