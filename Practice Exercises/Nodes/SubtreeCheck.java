public class SubtreeCheck {
    public static void main(String[] args) {
        TreeNode tree = buildBinaryTree();
        TreeNode subtree = buildSubtree();

        boolean isSubtree = isSubtree(tree, subtree);

        if (isSubtree) {
            System.out.println("The second tree is a subtree of the first tree.");
        } else {
            System.out.println("The second tree is not a subtree of the first tree.");
        }
    }

    public static boolean isSubtree(TreeNode tree, TreeNode subtree) {
        if (subtree == null) {
            return true;
        }

        if (tree == null) {
            return false;
        }

        if (areIdentical(tree, subtree)) {
            return true;
        }

        return isSubtree(tree.left, subtree) || isSubtree(tree.right, subtree);
    }

    private static boolean areIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null) {
            return (root1.data == root2.data) &&
                    areIdentical(root1.left, root2.left) &&
                    areIdentical(root1.right, root2.right);
        }

        return false;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        return root;
    }

    public static TreeNode buildSubtree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        return root;
    }
}
