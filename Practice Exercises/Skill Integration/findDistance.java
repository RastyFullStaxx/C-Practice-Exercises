public class NodeDistance {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();
        int node1Value = 1, node2Value = 6;

        int distance = findDistance(root, node1Value, node2Value);

        System.out.println("Distance between nodes with values " + node1Value + " and " + node2Value + ": " + distance);
    }

    public static int findDistance(TreeNode root, int value1, int value2) {
        TreeNode lcaNode = lowestCommonAncestor(root, value1, value2);

        int distanceFromNode1 = findDistanceFromNode(lcaNode, value1, 0);
        int distanceFromNode2 = findDistanceFromNode(lcaNode, value2, 0);

        return distanceFromNode1 + distanceFromNode2;
    }

    private static int findDistanceFromNode(TreeNode root, int targetValue, int distance) {
        if (root == null) {
            return -1;
        }

        if (root.data == targetValue) {
            return distance;
        }

        int leftDistance = findDistanceFromNode(root.left, targetValue, distance + 1);
        int rightDistance = findDistanceFromNode(root.right, targetValue, distance + 1);

        return Math.max(leftDistance, rightDistance);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, int value1, int value2) {
        if (root == null || root.data == value1 || root.data == value2) {
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, value1, value2);
        TreeNode rightLCA = lowestCommonAncestor(root.right, value1, value2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
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
