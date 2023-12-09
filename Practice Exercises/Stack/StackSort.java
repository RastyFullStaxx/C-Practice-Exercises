import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(4);

        Stack<Integer> sortedStack = sortStack(stack);

        System.out.println("Sorted Stack: " + sortedStack);
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        // Implement a function to sort a stack using an additional stack
        return new Stack<>();
    }
}
