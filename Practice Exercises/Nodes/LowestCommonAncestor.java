public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int node1Value = 1, node2Value = 3;

        TreeNode lcaNode = findLowestCommonAncestor(root, node1Value, node2Value);

        System.out.println("Lowest Common Ancestor of nodes with values " + node1Value + " and " + node2Value + ": " + lcaNode.data);
    }

    public static TreeNode findLowestCommonAncestor(TreeNode root, int value1, int value2) {
        if (root == null || root.data == value1 || root.data == value2) {
            return root;
        }

        TreeNode leftLCA = findLowestCommonAncestor(root.left, value1, value2);
        TreeNode rightLCA = findLowestCommonAncestor(root.right, value1, value2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
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
