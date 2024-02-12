public class LCMCalculator {
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        System.out.println("LCM of " + num1 + " and " + num2 + ": " + calculateLCM(num1, num2));
    }
}
