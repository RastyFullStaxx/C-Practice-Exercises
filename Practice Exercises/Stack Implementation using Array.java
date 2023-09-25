class Stack<T> {
    private static final int MAX_SIZE = 100;
    private Object[] elements;
    private int top;

    public Stack() {
        elements = new Object[MAX_SIZE];
        top = -1;
    }

    public void push(T item) {
        if (top == MAX_SIZE - 1) {
            throw new IllegalStateException("Stack is full.");
        }
        elements[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return (T) elements[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return (T) elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class StackArrayExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack Contents: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
