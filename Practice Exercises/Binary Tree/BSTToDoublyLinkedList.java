class DoublyListNode {
    int data;
    DoublyListNode prev;
    DoublyListNode next;

    public DoublyListNode(int data) {
        this.data = data;
    }
}

public class BSTToDoublyLinkedList {
    public static void main(String[] args) {
        TreeNode root = buildBST();
        DoublyListNode head = bstToDoublyLinkedList(root);

        System.out.println("Doubly Linked List from BST:");
        displayDoublyLinkedList(head);
    }

    public static DoublyListNode bstToDoublyLinkedList(TreeNode root) {
        DoublyListNode[] prev = {null};
        DoublyListNode[] head = {null};

        convertBSTToDoublyLinkedList(root, prev, head);

        return head[0];
    }

    private static void convertBSTToDoublyLinkedList(TreeNode root, DoublyListNode[] prev, DoublyListNode[] head) {
        if (root == null) {
            return;
        }

        convertBSTToDoublyLinkedList(root.left, prev, head);

        DoublyListNode newNode = new DoublyListNode(root.data);
        if (prev[0] == null) {
            head[0] = newNode;
        } else {
            prev[0].next = newNode;
            newNode.prev = prev[0];
        }
        prev[0] = newNode;

        convertBSTToDoublyLinkedList(root.right, prev, head);
    }

    public static void displayDoublyLinkedList(DoublyListNode head) {
        DoublyListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static TreeNode buildBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        return root;
    }
}
