public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = buildBST();

        boolean isValid = isValidBST(root);

        if (isValid) {
            System.out.println("The tree is a valid Binary Search Tree.");
        } else {
            System.out.println("The tree is not a valid Binary Search Tree.");
        }
    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }

        if (root.data <= minValue || root.data >= maxValue) {
            return false;
        }

        return isValidBST(root.left, minValue, root.data) && isValidBST(root.right, root.data, maxValue);
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left
