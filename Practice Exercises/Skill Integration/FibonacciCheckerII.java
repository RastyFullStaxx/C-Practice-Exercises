public class FibonacciChecker {
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a == num;
    }

    public static void main(String[] args) {
        int number = 21;
        System.out.println(number + " is a Fibonacci number: " + isFibonacci(number));
    }
}
