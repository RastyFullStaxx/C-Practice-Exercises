class DoublyListNode {
    int val;
    DoublyListNode prev, next;

    public DoublyListNode(int val) {
        this.val = val;
        this.prev = this.next = null;
    }
}

public class BTreeToDoublyLinkedList {
    public static void main(String[] args) {
        BTreeNode root = buildSampleBTree();

        DoublyListNode head = convertToDoublyLinkedList(root);

        System.out.println("Doubly Linked List from B-Tree:");
        printDoublyLinkedList(head);
    }

    public static DoublyListNode convertToDoublyLinkedList(BTreeNode root) {
        // Implement B-tree to doubly linked list conversion algorithm
        return null;
    }

    public static void printDoublyLinkedList(DoublyListNode head) {
        // Implement printing of doubly linked list
    }

    public static BTreeNode buildSampleBTree() {
        // Helper method to build a sample B-tree for testing
        return null;
    }
}
