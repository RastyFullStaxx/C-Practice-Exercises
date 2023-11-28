public class IdenticalBinaryTrees {
    public static void main(String[] args) {
        TreeNode tree1 = buildBinaryTree();
        TreeNode tree2 = buildBinaryTree();

        boolean identical = isIdentical(tree1, tree2);

        if (identical) {
            System.out.println("The two Binary Trees are identical.");
        } else {
            System.out.println("The two Binary Trees are not identical.");
        }
    }

    public static boolean isIdentical(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return (p.data == q.data) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
        }

        return false;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        return root;
    }
}
