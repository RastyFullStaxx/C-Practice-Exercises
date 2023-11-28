public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        System.out.println("Original Binary Tree:");
        printInorder(root);

        invertTree(root);

        System.out.println("\nInverted Binary Tree:");
        printInorder(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
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
