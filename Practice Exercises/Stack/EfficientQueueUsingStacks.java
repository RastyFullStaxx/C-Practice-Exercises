import java.util.Stack;

public class EfficientQueueUsingStacks {
    public static void main(String[] args) {
        EfficientMyQueue queue = new EfficientMyQueue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.front());
    }
}

class EfficientMyQueue {
    Stack<Integer> enqueueStack = new Stack<>();
    Stack<Integer> dequeueStack = new Stack<>();

    // Implement methods to enqueue, dequeue, and get the front element in the queue
}
