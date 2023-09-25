class Queue<T> {
    private static final int MAX_SIZE = 100;
    private Object[] elements;
    private int front, rear, size;

    public Queue() {
        elements = new Object[MAX_SIZE];
        front = rear = -1;
        size = 0;
    }

    public void enqueue(T item) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full.");
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % MAX_SIZE;
        elements[rear] = item;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        T item = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % MAX_SIZE;
        size--;
        
        if (size == 0) {
            front = rear = -1;
        }

        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return (T) elements[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class QueueArrayExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.print("Queue Contents: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
