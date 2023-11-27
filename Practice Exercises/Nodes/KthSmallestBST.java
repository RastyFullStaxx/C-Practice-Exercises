public class KthSmallestBST {
    private static int count = 0;

    public static void main(String[] args) {
        TreeNode root = buildBST();
        int k = 3;

        int kthSmallest = findKthSmallest(root, k);

        System.out.println(k + "th Smallest Element in the BST: " + kthSmallest);
    }

    public static int findKthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        int left = findKthSmallest(root.left, k);

        if (left != -1) {
            return left;
        }

        count++;

        if (count == k) {
            return root.data;
        }

        return findKthSmallest(root.right, k);
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);

        return root;
    }
}
