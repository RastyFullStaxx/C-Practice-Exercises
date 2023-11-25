class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BSTToDoublyLinkedList {
    private static TreeNode prev = null;
    private static TreeNode head = null;

    public static void main(String[] args) {
        TreeNode root = buildBST();

        convertBSTToDoublyLinkedList(root);

        System.out.println("Sorted Doubly Linked List:");
        printDoublyLinkedList();
    }

    public static void convertBSTToDoublyLinkedList(TreeNode root) {
        if (root == null) {
            return;
        }

        convertBSTToDoublyLinkedList(root.left);

        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }

        prev = root;

        convertBSTToDoublyLinkedList(root.right);
    }

    public static void printDoublyLinkedList() {
        TreeNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        return root;
    }
}
