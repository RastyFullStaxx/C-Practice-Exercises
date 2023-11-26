public class SumAtMaxDepth {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        int sum = sumAtMaxDepth(root);

        System.out.println("Sum of nodes at maximum depth: " + sum);
    }

    public static int sumAtMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int sum = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum += current.data;

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        return sum;
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
