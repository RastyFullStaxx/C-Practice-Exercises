public class ConvertToGreaterSumTree {
    private static int sum = 0;

    public static void main(String[] args) {
        TreeNode root = buildBST();

        convertToGreaterSumTree(root);

        System.out.println("Inorder Traversal of the Greater Sum Tree:");
        printInorder(root);
    }

    public static void convertToGreaterSumTree(TreeNode root) {
        if (root != null) {
            convertToGreaterSumTree(root.right);

            sum += root.data;
            root.data = sum;

            convertToGreaterSumTree(root.left);
        }
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        return root;
    }
}
