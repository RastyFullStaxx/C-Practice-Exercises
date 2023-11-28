public class SubtreeCheck {
    public static void main(String[] args) {
        TreeNode tree1 = buildBinaryTree();
        TreeNode tree2 = buildSubtree();

        boolean isSubtree = isSubtree(tree1, tree2);

        if (isSubtree) {
            System.out.println("The second Binary Tree is a subtree of the first Binary Tree.");
        } else {
            System.out.println("The second Binary Tree is not a subtree of the first Binary Tree.");
        }
    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (isSameTree(s, t)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return (p.data == q.data) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(0);

        return root;
    }

    public static TreeNode buildSubtree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        return root;
    }
}
