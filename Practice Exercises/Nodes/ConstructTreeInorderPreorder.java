import java.util.HashMap;
import java.util.Map;

public class ConstructTreeInorderPreorder {
    private static int preIndex = 0;

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {3, 9, 20, 15, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.println("Inorder Traversal of the Constructed Binary Tree:");
        printInorder(root);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, inorder.length - 1, indexMap);
    }

    private static TreeNode buildTreeHelper(int[] preorder, int inStart, int inEnd, Map<Integer, Integer> indexMap) {
        if (inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);

        int inIndex = indexMap.get(rootValue);

        root.left = buildTreeHelper(preorder, inStart, inIndex - 1, indexMap);
        root.right = buildTreeHelper(preorder, inIndex + 1, inEnd, indexMap);

        return root;
    }

    private static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }
}
