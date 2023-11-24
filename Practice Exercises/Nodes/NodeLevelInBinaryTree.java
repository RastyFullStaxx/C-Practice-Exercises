public class NodeLevelInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int targetValue = 3;

        int level = findLevel(root, targetValue, 1);

        if (level != -1) {
            System.out.println("Level of the node with value " + targetValue + ": " + level);
        } else {
            System.out.println("Node with value " + targetValue + " not found in the Binary Tree.");
        }
    }

    public static int findLevel(TreeNode root, int targetValue, int currentLevel) {
        if (root == null) {
            return -1;
        }

        if (root.data == targetValue) {
            return currentLevel;
        }

        int leftLevel = findLevel(root.left, targetValue, currentLevel + 1);
        int rightLevel = findLevel(root.right, targetValue, currentLevel + 1);

        return Math.max(leftLevel, rightLevel);
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
