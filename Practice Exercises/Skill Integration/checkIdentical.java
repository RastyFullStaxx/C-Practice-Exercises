public class IdenticalBinaryTrees {
    public static void main(String[] args) {
        TreeNode root1 = buildBinaryTree1();
        TreeNode root2 = buildBinaryTree2();

        boolean areIdentical = checkIdentical(root1, root2);

        if (areIdentical) {
            System.out.println("The Binary Trees are identical.");
        } else {
            System.out.println("The Binary Trees are not identical.");
        }
    }

    public static boolean checkIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null) {
            return (root1.data == root2.data) &&
                    checkIdentical(root1.left, root2.left) &&
                    checkIdentical(root1.right, root2.right);
        }

        return false;
    }

    public static TreeNode buildBinaryTree1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        return root;
    }

    public static TreeNode buildBinaryTree2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        return root;
    }
}
