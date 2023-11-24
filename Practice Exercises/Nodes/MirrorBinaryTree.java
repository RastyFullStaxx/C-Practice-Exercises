public class MirrorBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        System.out.println("Original Binary Tree:");
        printInorder(root);

        mirrorTree(root);

        System.out.println("\nMirror Binary Tree:");
        printInorder(root);
    }

    public static void mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            mirrorTree(root.left);
            mirrorTree(root.right);
        }
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        return root;
    }
}
