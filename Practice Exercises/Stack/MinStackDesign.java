import java.util.Stack;

public class MinStackDesign {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        System.out.println("Min element: " + stack.getMin());
        stack.pop();
        System.out.println("Min element after pop: " + stack.getMin());
    }
}

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Implement methods to push, pop, get top, and get minimum element in the stack
}
