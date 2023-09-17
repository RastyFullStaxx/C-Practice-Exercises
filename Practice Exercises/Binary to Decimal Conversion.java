public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "101010";
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimal);
    }
}
