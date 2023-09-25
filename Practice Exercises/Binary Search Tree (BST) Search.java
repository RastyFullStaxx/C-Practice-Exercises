class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTSearch {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        int target = 40;
        boolean found = search(root, target);

        System.out.println("Is " + target + " present in the BST? " + found);
    }

    public static boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        }

        if (key == root.val) {
            return true;
        } else if (key < root.val) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}
