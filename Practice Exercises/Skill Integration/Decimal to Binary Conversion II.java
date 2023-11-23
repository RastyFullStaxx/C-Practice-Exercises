public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 13;
        String binary = decimalToBinary(decimal);

        System.out.println("Decimal " + decimal + " is equivalent to binary " + binary);
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }
}
