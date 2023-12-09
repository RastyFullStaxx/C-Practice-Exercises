import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MyMinStack minStack = new MyMinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        System.out.println("Min element: " + minStack.getMin());
        minStack.pop();
        System.out.println("Min element after pop: " + minStack.getMin());
    }
}

class MyMinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Implement methods to push, pop, get minimum element in the stack
}
