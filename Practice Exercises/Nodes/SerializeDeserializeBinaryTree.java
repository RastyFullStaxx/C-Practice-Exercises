import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinaryTree {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        String serialized = serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        TreeNode deserialized = deserialize(serialized);
        System.out.println("Inorder Traversal of the Deserialized Tree:");
        printInorder(deserialized);
    }

    public static String serialize(TreeNode root) {
        if (root == null) {
            return "null";
        }

        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);

        return root.data + "," + leftSerialized + "," + rightSerialized;
    }

    public static TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(nodes);
    }

    private static TreeNode deserializeHelper(Queue<String> nodes) {
        String val = nodes.poll();

        if (val.equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(nodes);
        node.right = deserializeHelper(nodes);

        return node;
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        return root;
    }
}
