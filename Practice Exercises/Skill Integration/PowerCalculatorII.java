public class PowerCalculator {
    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent < 0 ? 1 / result : result;
    }

    public static void main(String[] args) {
        double base = 2.5;
        int exponent = -3;
        System.out.println(base + " raised to the power " + exponent + ": " + power(base, exponent));
    }
}
