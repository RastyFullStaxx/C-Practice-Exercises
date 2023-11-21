public class BSTLCA {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        TreeNode p = root.left.left; // Node with value 2
        TreeNode q = root.left.right; // Node with value 4

        TreeNode lcaNode = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor: " + lcaNode.data);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (p.data < root.data && q.data < root.data) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.data > root.data && q.data > root.data) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
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
