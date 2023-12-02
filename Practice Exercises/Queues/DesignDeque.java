import java.util.LinkedList;

class MyDeque {
    private LinkedList<Integer> list;

    public MyDeque() {
        list = new LinkedList<>();
    }

    public void insertFront(int value) {
        list.addFirst(value);
    }

    public void insertLast(int value) {
        list.addLast(value);
    }

    public int deleteFront() {
        if (isEmpty()) {
            return -1;
        }
        return list.removeFirst();
    }

    public int deleteLast() {
        if (isEmpty()) {
            return -1;
        }
        return list.removeLast();
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return list.getFirst();
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return false; // A linked list-based deque is never full
    }
}

public class DesignDeque {
    public static void main(String[] args) {
        MyDeque deque = new MyDeque();
        deque.insertFront(1);
        deque.insertLast(2);
        System.out.println("Front: " + deque.getFront());   // Output: 1
        System.out.println("Rear: " + deque.getRear());     // Output: 2
        System.out.println("Delete Front: " + deque.deleteFront()); // Output: 1
        System.out.println("Delete Last: " + deque.deleteLast());   // Output: 2
        System.out.println("Is Empty: " + deque.isEmpty());   // Output: true
    }
}
