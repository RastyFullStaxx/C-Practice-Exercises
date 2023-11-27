public class TrimBST {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int low = 2, high = 5;

        TreeNode trimmedBST = trimBST(root, low, high);

        System.out.println("Inorder Traversal of the Trimmed BST:");
        printInorder(trimmedBST);
    }

    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

        if (root.data < low) {
            return trimBST(root.right, low, high);
        } else if (root.data > high) {
            return trimBST(root.left, low, high);
        } else {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
        }
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        return root;
    }
}
