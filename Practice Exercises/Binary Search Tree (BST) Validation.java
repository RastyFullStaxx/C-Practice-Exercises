class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTValidation {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean isValidBST = isValidBST(root);

        System.out.println("Is the binary tree a valid BST? " + isValidBST);
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private static boolean isValidBST(TreeNode node, TreeNode min, TreeNode max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.val <= min.val) || (max != null && node.val >= max.val)) {
            return false;
        }

        return isValidBST(node.left, min, node) && isValidBST(node.right, node, max);
    }
}
