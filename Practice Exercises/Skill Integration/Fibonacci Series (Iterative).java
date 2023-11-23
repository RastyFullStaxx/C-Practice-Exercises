public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series (first " + n + " terms): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int prev = 0;
        int current = 1;
        int next;

        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
}
