import java.util.LinkedList;
import java.util.Queue;

public class DeepestNodeBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        TreeNode deepestNode = findDeepestNode(root);

        System.out.println("Value of the Deepest Node: " + deepestNode.data);
    }

    public static TreeNode findDeepestNode(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode deepestNode = null;

        while (!queue.isEmpty()) {
            deepestNode = queue.poll();

            if (deepestNode.left != null) {
                queue.add(deepestNode.left);
            }

            if (deepestNode.right != null) {
                queue.add(deepestNode.right);
            }
        }

        return deepestNode;
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
