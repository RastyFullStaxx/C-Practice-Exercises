public class BinaryToDecimalConverter {
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        String binary = "101010";
        System.out.println("Decimal equivalent of " + binary + ": " + binaryToDecimal(binary));
    }
}
