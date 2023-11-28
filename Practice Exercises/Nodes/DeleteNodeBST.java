public class DeleteNodeBST {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int key = 3;

        System.out.println("Inorder Traversal before Deleting Node " + key + ":");
        printInorder(root);

        root = deleteNode(root, key);

        System.out.println("\nInorder Traversal after Deleting Node " + key + ":");
        printInorder(root);
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = findMinValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    private static int findMinValue(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        return root;
    }
}
