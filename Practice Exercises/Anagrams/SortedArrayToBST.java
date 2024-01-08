class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        System.out.println("Sorted Array: " + Arrays.toString(nums));
        TreeNode bstRoot = sortedArrayToBST(nums);
        System.out.println("Binary Search Tree (BST) Root:");
        printBSTInOrder(bstRoot);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        // Implement a method to convert a sorted array to a height-balanced binary search tree (BST)
        return null;
    }

    private static void printBSTInOrder(TreeNode root) {
        if (root != null) {
            printBSTInOrder(root.left);
            System.out.print(root.val + " ");
            printBSTInOrder(root.right);
        }
    }
}
