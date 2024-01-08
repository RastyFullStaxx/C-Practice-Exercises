class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.println("List 1:");
        printLinkedList(l1);
        System.out.println("List 2:");
        printLinkedList(l2);
        ListNode mergedList = mergeTwoLists(l1, l2);
        System.out.println("Merged List:");
        printLinkedList(mergedList);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Implement a method to merge two sorted linked lists
        return null;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
