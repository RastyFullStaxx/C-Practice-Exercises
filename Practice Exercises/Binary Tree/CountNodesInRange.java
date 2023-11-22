public class CountNodesInRange {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int low = 3, high = 7;

        int count = countNodesInRange(root, low, high);

        System.out.println("Number of nodes in the range [" + low + ", " + high + "]: " + count);
    }

    public static int countNodesInRange(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (root.data < low) {
            return countNodesInRange(root.right, low, high);
        } else if (root.data > high) {
            return countNodesInRange(root.left, low, high);
        } else {
            return 1 + countNodesInRange(root.left, low, high) + countNodesInRange(root.right, low, high);
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
