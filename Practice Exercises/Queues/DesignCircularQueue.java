class MyCircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }

        size--;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}

public class DesignCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println("Enqueue 1: " + circularQueue.enQueue(1));  // Output: true
        System.out.println("Enqueue 2: " + circularQueue.enQueue(2));  // Output: true
        System.out.println("Enqueue 3: " + circularQueue.enQueue(3));  // Output: true
        System.out.println("Enqueue 4: " + circularQueue.enQueue(4));  // Output: false
        System.out.println("Rear: " + circularQueue.Rear());           // Output: 3
        System.out.println("Is Full: " + circularQueue.isFull());      // Output: true
        System.out.println("Dequeue: " + circularQueue.deQueue());      // Output: true
        System.out.println("Enqueue 4: " + circularQueue.enQueue(4));  // Output: true
        System.out.println("Rear: " + circularQueue.Rear());           // Output: 4
    }
}
