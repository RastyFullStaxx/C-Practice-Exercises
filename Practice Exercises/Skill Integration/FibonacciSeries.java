public class FibonacciSeries {
    public static void generateSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    
    public static void main(String[] args) {
        int terms = 10;
        generateSeries(terms);
    }
}
