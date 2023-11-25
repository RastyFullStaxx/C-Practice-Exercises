public class InorderSuccessorBST {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        int targetValue = 3;

        TreeNode successor = findInorderSuccessor(root, targetValue);

        if (successor != null) {
            System.out.println("Inorder Successor of the node with value " + targetValue + ": " + successor.data);
        } else {
            System.out.println("Node with value " + targetValue + " not found in the Binary Search Tree.");
        }
    }

    public static TreeNode findInorderSuccessor(TreeNode root, int targetValue) {
        TreeNode current = findNode(root, targetValue);

        if (current == null) {
            return null;
        }

        if (current.right != null) {
            return findMinValueNode(current.right);
        } else {
            TreeNode successor = null;
            TreeNode ancestor = root;

            while (ancestor != current) {
                if (current.data < ancestor.data) {
                    successor = ancestor;
                    ancestor = ancestor.left;
                } else {
                    ancestor = ancestor.right;
                }
            }

            return successor;
        }
    }

    private static TreeNode findMinValueNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private static TreeNode findNode(TreeNode root, int targetValue) {
        if (root == null || root.data == targetValue) {
            return root;
        }

        if (targetValue < root.data) {
            return findNode(root.left, targetValue);
        } else {
            return findNode(root.right, targetValue);
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        return root;
    }
}
