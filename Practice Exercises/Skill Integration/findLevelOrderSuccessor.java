public class LevelOrderSuccessor {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int targetValue = 3;

        TreeNode successor = findLevelOrderSuccessor(root, targetValue);

        if (successor != null) {
            System.out.println("Level Order Successor of the node with value " + targetValue + ": " + successor.data);
        } else {
            System.out.println("Node with value " + targetValue + " not found in the Binary Tree.");
        }
    }

    public static TreeNode findLevelOrderSuccessor(TreeNode root, int targetValue) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.data == targetValue && !queue.isEmpty()) {
                return queue.poll();
            }

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return null;
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
