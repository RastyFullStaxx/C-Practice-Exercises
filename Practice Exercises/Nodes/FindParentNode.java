public class FindParentNode {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int targetValue = 3;

        TreeNode parentNode = findParent(root, targetValue);

        if (parentNode != null) {
            System.out.println("Parent of the node with value " + targetValue + ": " + parentNode.data);
        } else {
            System.out.println("Node with value " + targetValue + " is the root or not found.");
        }
    }

    public static TreeNode findParent(TreeNode root, int targetValue) {
        if (root == null || (root.left != null && root.left.data == targetValue) || (root.right != null && root.right.data == targetValue)) {
            return root;
        }

        TreeNode leftParent = findParent(root.left, targetValue);
        TreeNode rightParent = findParent(root.right, targetValue);

        return leftParent != null ? leftParent : rightParent;
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
