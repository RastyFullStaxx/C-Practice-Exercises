public class ArrayStack {
    private static final int MAX_SIZE = 100;
    private int[] stackArray;
    private int top;

    public ArrayStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Popped: " + stackArray[top--]);
        } else {
            System.out.println("Stack Underflow");
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
    }
}
