import java.util.HashMap;
import java.util.Map;

public class VerticalSumBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        Map<Integer, Integer> verticalSum = new HashMap<>();
        findVerticalSum(root, 0, verticalSum);

        System.out.println("Vertical Sum of the Binary Tree:");
        verticalSum.forEach((k, v) -> System.out.println("Vertical Level " + k + ": " + v));
    }

    public static void findVerticalSum(TreeNode root, int level, Map<Integer, Integer> verticalSum) {
        if (root == null) {
            return;
        }

        findVerticalSum(root.left, level - 1, verticalSum);

        verticalSum.put(level, verticalSum.getOrDefault(level, 0) + root.data);

        findVerticalSum(root.right, level + 1, verticalSum);
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;
    }
}
