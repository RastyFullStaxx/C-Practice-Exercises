public class FibonacciSeriesIterative {
    public static void generateSeries(int terms) {
        int prev = 0, next = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(prev + " ");
            int sum = prev + next;
            prev = next;
            next = sum;
        }
    }

    public static void main(String[] args) {
        int terms = 10;
        generateSeries(terms);
    }
}
