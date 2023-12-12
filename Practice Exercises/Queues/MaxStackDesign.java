import java.util.Stack;

public class MaxStackDesign {
    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(3);
        maxStack.push(5);
        maxStack.push(2);
        maxStack.push(1);

        System.out.println("Max element: " + maxStack.getMax());
        maxStack.pop();
        System.out.println("Max element after pop: " + maxStack.getMax());
    }
}

class MaxStack {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    public MaxStack() {
        // Implement the constructor for the MaxStack
    }

    public void push(int x) {
        // Implement the push operation for the MaxStack
    }

    public int pop() {
        // Implement the pop operation for the MaxStack
        return 0;
    }

    public int top() {
        // Implement the top operation for the MaxStack
        return 0;
    }

    public int getMax() {
        // Implement a function to get the maximum element in the MaxStack
        return 0;
    }
}
