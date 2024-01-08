public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = headA.next.next;

        System.out.println("List A:");
        printLinkedList(headA);
        System.out.println("List B:");
        printLinkedList(headB);
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        System.out.println("Intersection Node Value: " + intersectionNode.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Implement a method to find the node at which the intersection of two linked lists begins
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
