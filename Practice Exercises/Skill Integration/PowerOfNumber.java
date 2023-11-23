public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePower(base, exponent);

        System.out.println(base + " to the power of " + exponent + " is " + result);
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }
}
