public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series (first " + n + " terms): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        int a = 0, b = 1;
        if (n == 0) return a;
        if (n == 1) return b;

        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
