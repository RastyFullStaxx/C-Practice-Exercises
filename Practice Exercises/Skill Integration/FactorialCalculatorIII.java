public class FactorialCalculator {
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + ": " + calculateFactorial(num));
    }
}
