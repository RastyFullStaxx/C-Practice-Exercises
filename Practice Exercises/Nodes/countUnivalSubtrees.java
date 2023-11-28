public class CountUnivalSubtrees {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int count = countUnivalSubtrees(root);

        System.out.println("Number of Unival Subtrees: " + count);
    }

    public static int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] count = {0};
        isUnivalSubtree(root, count);
        return count[0];
    }

    private static boolean isUnivalSubtree(TreeNode root, int[] count) {
        if (root == null) {
            return true;
        }

        boolean left = isUnivalSubtree(root.left, count);
        boolean right = isUnivalSubtree(root.right, count);

        if (left && right) {
            if ((root.left != null && root.data == root.left.data) || root.left == null) {
                if ((root.right != null && root.data == root.right.data) || root.right == null) {
                    count[0]++;
                    return true;
                }
            }
        }

        return false;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(5);

        return root;
    }
}
