public class LCMCalculator {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int lcm = calculateLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}
