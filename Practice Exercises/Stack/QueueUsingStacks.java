import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.front());
    }
}

class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Implement methods to enqueue, dequeue, and get the front element in the queue
}
