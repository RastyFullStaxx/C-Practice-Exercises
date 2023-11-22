public class KthSmallestElement {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int k = 3;

        int kthSmallest = kthSmallest(root, k);

        System.out.println("The " + k + "th smallest element in the BST: " + kthSmallest);
    }

    public static int kthSmallest(TreeNode root, int k) {
        int[] result = {0};
        int[] count = {0};

        findKthSmallest(root, k, count, result);

        return result[0];
    }

    private static void findKthSmallest(TreeNode root, int k, int[] count, int[] result) {
        if (root == null) {
            return;
        }

        findKthSmallest(root.left, k, count, result);

        count[0]++;
        if (count[0] == k) {
            result[0] = root.data;
            return;
        }

        findKthSmallest(root.right, k, count, result);
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
