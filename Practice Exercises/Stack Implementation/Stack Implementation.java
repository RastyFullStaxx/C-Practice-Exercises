import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("is");
        stack.push("awesome");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
