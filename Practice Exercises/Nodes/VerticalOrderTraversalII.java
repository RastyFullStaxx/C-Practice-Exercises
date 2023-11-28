import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        List<List<Integer>> verticalOrder = verticalOrderTraversal(root);

        System.out.println("Vertical Order Traversal:");
        verticalOrder.forEach(System.out::println);
    }

    public static List<List<Integer>> verticalOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, List<Integer>> verticalMap = new TreeMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> columnQueue = new LinkedList<>();

        queue.add(root);
        columnQueue.add(0);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            int column = columnQueue.poll();

            verticalMap.computeIfAbsent(column, k -> new ArrayList<>()).add(current.data);

            if (current.left != null) {
                queue.add(current.left);
                columnQueue.add(column - 1);
            }

            if (current.right != null) {
                queue.add(current.right);
                columnQueue.add(column + 1);
            }
        }

        result.addAll(verticalMap.values());
        return result;
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
