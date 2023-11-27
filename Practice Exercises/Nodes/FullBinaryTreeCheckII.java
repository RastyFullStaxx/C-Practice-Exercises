public class FullBinaryTreeCheckII {
    public static void main(String[] args) {
        TreeNode root = buildFullBinaryTree();

        boolean isFullBinaryTree = isFullBinaryTree(root);

        if (isFullBinaryTree) {
            System.out.println("The Binary Tree is a full binary tree.");
        } else {
            System.out.println("The Binary Tree is not a full binary tree.");
        }
    }

    public static boolean isFullBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null && root.right != null) {
            return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
        }

        return false;
    }

    public static TreeNode buildFullBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;
    }
}
