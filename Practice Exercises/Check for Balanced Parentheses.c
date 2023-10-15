import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "{[()]()}";
        boolean isBalanced = isBalancedParentheses(expression);

        System.out.println("Expression '" + expression + "' is balanced? " + isBalanced);
    }

    public static boolean isBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
