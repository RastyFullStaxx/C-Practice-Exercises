import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        verticalOrderTraversal(root);
    }

    public static void verticalOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeMap<Integer, List<Integer>> verticalMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair currentPair = queue.poll();
            TreeNode current = currentPair.node;
            int hd = currentPair.horizontalDistance;

            verticalMap.computeIfAbsent(hd, k -> new ArrayList<>()).add(current.data);

            if (current.left != null) {
                queue.offer(new Pair(current.left, hd - 1));
            }

            if (current.right != null
