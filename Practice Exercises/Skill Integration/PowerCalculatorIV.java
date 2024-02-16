public class PowerCalculator {
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        System.out.println(base + " raised to the power of " + exponent + " is: " + calculatePower(base, exponent));
    }
}
