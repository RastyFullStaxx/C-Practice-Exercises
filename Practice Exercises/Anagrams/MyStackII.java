class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyStack {
    private Node top;

    public MyStack() {
        top = null;
    }

    public void push(int x) {
        // Implement a method to push an element onto the stack
    }

    public int pop() {
        // Implement a method to pop the element from the top of the stack
        return 0;
    }

    public int top() {
        // Implement a method to get the top element of the stack without popping it
        return 0;
    }

    public boolean empty() {
        // Implement a method to check if the stack is empty
        return false;
    }
}
