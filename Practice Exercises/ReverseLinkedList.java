class ListNodeReverse {
    int val;
    ListNodeReverse next;

    ListNodeReverse(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNodeReverse head = new ListNodeReverse(1);
        head.next = new ListNodeReverse(2);
        head.next.next = new ListNodeReverse(3);
        head.next.next.next = new ListNodeReverse(4);

        System.out.print("Original Linked List: ");
        displayLinkedList(head);

        ListNodeReverse reversedHead = reverseList(head);

        System.out.print("\nReversed Linked List: ");
        displayLinkedList(reversedHead);
    }

    public static ListNodeReverse reverseList(ListNodeReverse head) {
        ListNodeReverse prev = null;
        ListNodeReverse current = head;

        while (current != null) {
            ListNodeReverse nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void displayLinkedList(ListNodeReverse head) {
        ListNodeReverse current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
