public class ArmstrongNumberCheckerString {
    public static boolean isArmstrongNumber(String str) {
        int length = str.length();
        int sum = 0;
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            sum += Math.pow(digit, length);
        }
        return Integer.parseInt(str) == sum;
    }

    public static void main(String[] args) {
        String number = "1634";
        System.out.println(number + " is an Armstrong number: " + isArmstrongNumber(number));
    }
}
