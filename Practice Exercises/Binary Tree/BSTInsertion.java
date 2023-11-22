public class BSTInsertion {
    public static void main(String[] args) {
        TreeNode root = null;
        int[] valuesToInsert = {10, 5, 15, 3, 7, 12, 18};

        for (int value : valuesToInsert) {
            root = insert(root, value);
        }

        System.out.println("Inorder traversal after insertion:");
        inorderTraversal(root);
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}
