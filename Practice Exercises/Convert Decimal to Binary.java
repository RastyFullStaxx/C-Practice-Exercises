public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 25;
        String binary = convertDecimalToBinary(decimal);

        System.out.println("Binary representation of " + decimal + ": " + binary);
    }

    public static String convertDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
}
