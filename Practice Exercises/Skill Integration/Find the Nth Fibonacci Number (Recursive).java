public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n = 8;
        int nthFibonacci = findNthFibonacciRecursive(n);

        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
    }

    public static int findNthFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return findNthFibonacciRecursive(n - 1) + findNthFibonacciRecursive(n - 2);
    }
}
