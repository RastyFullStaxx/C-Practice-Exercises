import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTreeCheck {
    public static void main(String[] args) {
        TreeNode root = buildCompleteBinaryTree();

        boolean isComplete = isCompleteBinaryTree(root);

        if (isComplete) {
            System.out.println("The Binary Tree is a complete binary tree.");
        } else {
            System.out.println("The Binary Tree is not a complete binary tree.");
        }
    }

    public static boolean isCompleteBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                break;
            }

            queue.add(current.left);
            queue.add(current.right);
        }

        while (!queue.isEmpty() && queue.peek() == null) {
            queue.poll();
        }

        return queue.isEmpty();
    }

    public static TreeNode buildCompleteBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        return root;
    }
}
