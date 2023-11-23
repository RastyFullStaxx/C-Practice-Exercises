public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1101";
        int decimal = convertBinaryToDecimal(binary);

        System.out.println("Decimal representation of " + binary + ": " + decimal);
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int n = binary.length() - 1;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, n - i);
            }
        }

        return decimal;
    }
}
