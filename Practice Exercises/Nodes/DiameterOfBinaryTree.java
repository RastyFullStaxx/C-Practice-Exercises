public class DiameterOfBinaryTree {
    private static int diameter = 0;

    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int diameter = findDiameter(root);

        System.out.println("Diameter of the Binary Tree: " + diameter);
    }

    public static int findDiameter(TreeNode root) {
        calculateDiameter(root);
        return diameter;
    }

    private static int calculateDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateDiameter(root.left);
        int rightHeight = calculateDiameter(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        return root;
    }
}
