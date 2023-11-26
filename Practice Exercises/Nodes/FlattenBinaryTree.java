public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        flatten(root);

        System.out.println("Flattened Linked List:");
        printFlattenedList(root);
    }

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            flatten(root.left);

            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;

            TreeNode current = root.right;
            while (current.right != null) {
                current = current.right;
            }

            current.right = temp;
        }

        flatten(root.right);
    }

    public static void printFlattenedList(TreeNode root) {
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
