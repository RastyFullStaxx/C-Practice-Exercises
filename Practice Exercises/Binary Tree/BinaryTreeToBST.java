import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeToBST {
    public static void main(String[] args) {
        TreeNode root = buildBinaryTree();

        System.out.println("Inorder traversal of the Binary Tree:");
        inorderTraversal(root);

        convertBinaryTreeToBST(root);

        System.out.println("\nInorder traversal of the Binary Search Tree:");
        inorderTraversal(root);
    }

    public static void convertBinaryTreeToBST(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        getInorderList(root, inorderList);

        Collections.sort(inorderList);

        index[0] = 0;
        convertToBST(root, inorderList);
    }

    private static void getInorderList(TreeNode root, List<Integer> list) {
        if (root != null) {
            getInorderList(root.left, list);
            list.add(root.data);
            getInorderList(root.right, list);
        }
    }

    private static int[] index = {0};

    private static void convertToBST(TreeNode root, List<Integer> list) {
        if (root != null) {
            convertToBST(root.left, list);
            root.data = list.get(index[0]++);
            convertToBST(root.right, list);
        }
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static TreeNode buildBinaryTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        return root;
    }
}
