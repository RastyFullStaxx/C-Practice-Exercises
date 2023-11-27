import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClosestLeafBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        TreeNode targetNode = root.left.left;

        int closestLeaf = findClosestLeaf(root, targetNode);

        System.out.println("Closest Leaf to the target node: " + closestLeaf);
    }

    public static int findClosestLeaf(TreeNode root, TreeNode target) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        populateParentMap(root, null, parentMap);

        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);

        return findClosestLeafUtil(target, parentMap, visited);
    }

    private static void populateParentMap(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (node != null) {
            parentMap.put(node, parent);
            populateParentMap(node.left, node, parentMap);
            populateParentMap(node.right, node, parentMap);
        }
    }

    private static int findClosestLeafUtil(TreeNode target, Map<TreeNode, TreeNode> parentMap, Set<TreeNode> visited) {
        if (target == null) {
            return Integer.MAX_VALUE;
        }

        if (target.left == null && target.right == null) {
            return target.data;
        }

        visited.add(target);

        int leftClosest = findClosestLeafUtil(target.left, parentMap, visited);
        int rightClosest = findClosestLeafUtil(target.right, parentMap, visited);

        TreeNode parent = parentMap.get(target);
        int parentClosest = (parent != null && !visited.contains(parent)) ? findClosestLeafUtil(parent, parentMap, visited) : Integer.MAX_VALUE;

        return Math.min(leftClosest, Math.min(rightClosest, parentClosest));
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
