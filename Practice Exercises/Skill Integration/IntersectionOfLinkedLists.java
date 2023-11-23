class ListNodeIntersection {
    int val;
    ListNodeIntersection next;

    ListNodeIntersection(int val) {
        this.val = val;
    }
}

public class IntersectionOfLinkedLists {
    public static void main(String[] args) {
        ListNodeIntersection headA = new ListNodeIntersection(1);
        headA.next = new ListNodeIntersection(2);
        headA.next.next = new ListNodeIntersection(3);
        headA.next.next.next = new ListNodeIntersection(4);

        ListNodeIntersection headB = new ListNodeIntersection(5);
        headB.next = new ListNodeIntersection(6);
        headB.next.next = headA.next.next; // Intersection point

        ListNodeIntersection intersectionPoint = getIntersectionNode(headA, headB);

        if (intersectionPoint != null) {
            System.out.println("Intersection point value: " + intersectionPoint.val);
        } else {
            System.out.println("No intersection point found.");
        }
    }

    public static ListNodeIntersection getIntersectionNode(ListNodeIntersection headA, ListNodeIntersection headB) {
        ListNodeIntersection pointerA = headA;
        ListNodeIntersection pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }
}
