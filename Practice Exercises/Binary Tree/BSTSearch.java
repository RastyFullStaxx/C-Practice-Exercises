public class BSTSearch {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int target = 7;

        boolean isFound = search(root, target);

        if (isFound) {
            System.out.println(target + " is found in the BST.");
        } else {
            System.out.println(target + " is not found in the BST.");
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

    public static boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (target == root.data) {
            return true;
        } else if (target < root.data) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }
}
