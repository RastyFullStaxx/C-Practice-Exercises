public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1101";
        int decimal = binaryToDecimal(binary);

        System.out.println("Binary " + binary + " is equivalent to decimal " + decimal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }

        return decimal;
    }
}
