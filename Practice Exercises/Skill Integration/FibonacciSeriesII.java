public class FibonacciSeries {
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        int terms = 10;
        printFibonacciSeries(terms);
    }
}
