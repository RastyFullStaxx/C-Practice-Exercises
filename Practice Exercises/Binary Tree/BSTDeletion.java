public class BSTDeletion {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int valueToDelete = 7;

        System.out.println("Inorder traversal before deletion:");
        inorderTraversal(root);

        root = delete(root, valueToDelete);

        System.out.println("\nInorder traversal after deletion:");
        inorderTraversal(root);
    }

    public static TreeNode delete(TreeNode root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.data) {
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right, value);
        } else {
            // Node with one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children, get the inorder successor
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public static int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        return root;
    }
}
