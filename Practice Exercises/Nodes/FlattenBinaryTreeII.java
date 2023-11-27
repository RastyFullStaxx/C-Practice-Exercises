public class FlattenBinaryTreeII {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        flatten(root);

        System.out.println("Flattened Binary Tree:");
        printFlattenedTree(root);
    }

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        while (root.right != null) {
            root = root.right;
        }

        root.right = temp;
    }

    private static void printFlattenedTree(TreeNode root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        return root;
    }
}
