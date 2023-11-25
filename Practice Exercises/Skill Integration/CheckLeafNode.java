public class CheckLeafNode {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int targetValue = 3;

        boolean isLeaf = isLeafNode(root, targetValue);

        if (isLeaf) {
            System.out.println("Node with value " + targetValue + " is a leaf node.");
        } else {
            System.out.println("Node with value " + targetValue + " is not a leaf node or not found.");
        }
    }

    public static boolean isLeafNode(TreeNode root, int targetValue) {
        if (root == null) {
            return false;
        }

        if (root.data == targetValue && root.left == null && root.right == null) {
            return true;
        }

        return isLeafNode(root.left, targetValue) || isLeafNode(root.right, targetValue);
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        return root;
    }
}
