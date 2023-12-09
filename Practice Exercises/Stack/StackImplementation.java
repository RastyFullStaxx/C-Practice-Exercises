public class StackImplementation {
    public static void main(String[] args) {
        // Implement a stack using an array or linked list
        Stack<Integer> stack = new Stack<>();
        
        // Test various stack operations
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
