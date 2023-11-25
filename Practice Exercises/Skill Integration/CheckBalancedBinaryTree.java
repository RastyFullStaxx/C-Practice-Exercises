public class CheckBalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBalancedBinaryTree();

        boolean isBalanced = isBalanced(root);

        if (isBalanced) {
            System.out.println("The Binary Tree is balanced.");
        } else {
            System.out.println("The Binary Tree is not balanced.");
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return (maxDepth(root) - minDepth(root)) <= 1;
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    private static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static TreeNode buildBalancedBinaryTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        return root;
    }
}
