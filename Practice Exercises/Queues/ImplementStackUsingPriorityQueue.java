import java.util.PriorityQueue;

class MyStack {
    private PriorityQueue<int[]> pq;
    private int timestamp;

    public MyStack() {
        pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        timestamp = 0;
    }

    public void push(int x) {
        pq.offer(new int[]{x, timestamp++});
    }

    public int pop() {
        return pq.poll()[0];
    }

    public int top() {
        return pq.peek()[0];
    }

    public boolean empty() {
        return pq.isEmpty();
    }
}

public class ImplementStackUsingPriorityQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println("Top: " + stack.top());   // Output: 2
        System.out.println("Pop: " + stack.pop());   // Output: 2
        System.out.println("Empty: " + stack.empty());// Output: false
    }
}
