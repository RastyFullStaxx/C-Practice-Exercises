public class PowerCalculator {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + ": " + result);
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }
}
