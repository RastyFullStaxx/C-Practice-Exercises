public class CheckSiblings {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int node1Value = 1, node2Value = 3;

        boolean areSiblings = checkSiblings(root, node1Value, node2Value);

        if (areSiblings) {
            System.out.println("Nodes with values " + node1Value + " and " + node2Value + " are siblings.");
        } else {
            System.out.println("Nodes with values " + node1Value + " and " + node2Value + " are not siblings.");
        }
    }

    public static boolean checkSiblings(TreeNode root, int value1, int value2) {
        if (root == null) {
            return false;
        }

        if ((root.left != null && root.right != null) &&
                ((root.left.data == value1 && root.right.data == value2) ||
                 (root.left.data == value2 && root.right.data == value1))) {
            return true;
        }

        return checkSiblings(root.left, value1, value2) || checkSiblings(root.right, value1, value2);
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
