import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBST {
    public static void main(String[] args) {
        TreeNode root = buildBST();

        String serialized = serializeBST(root);
        System.out.println("Serialized BST: " + serialized);

        TreeNode deserialized = deserializeBST(serialized);
        System.out.println("Inorder Traversal of the Deserialized BST:");
        printInorder(deserialized);
    }

    public static String serializeBST(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        serializeBSTHelper(root, result);
        return result.toString();
    }

    private static void serializeBSTHelper(TreeNode root, StringBuilder result) {
        if (root == null) {
            return;
        }

        result.append(root.data).append(" ");
        serializeBSTHelper(root.left, result);
        serializeBSTHelper(root.right, result);
    }

    public static TreeNode deserializeBST(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] values = data.split(" ");
        Queue<Integer> queue = new LinkedList<>();
        Arrays.stream(values).forEach(value -> queue.add(Integer.parseInt(value)));

        return deserializeBSTHelper(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static TreeNode deserializeBSTHelper(Queue<Integer> queue, int minValue, int maxValue) {
        if (queue.isEmpty()) {
            return null;
        }

        int value = queue.peek();
        if (value < minValue || value > maxValue) {
            return null;
        }

        queue.poll();
        TreeNode root = new TreeNode(value);
        root.left = deserializeBSTHelper(queue, minValue, value);
        root.right = deserializeBSTHelper(queue, value, maxValue);

        return root;
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        return root;
    }
}
