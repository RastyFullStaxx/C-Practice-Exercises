public class DecimalToBinaryConverter {
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int decimal = 25;
        System.out.println("Binary equivalent of " + decimal + ": " + decimalToBinary(decimal));
    }
}
