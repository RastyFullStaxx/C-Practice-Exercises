public class FibonacciSeriesLimit {
    public static void printFibonacciSeries(int limit) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        int limit = 50;
        printFibonacciSeries(limit);
    }
}
