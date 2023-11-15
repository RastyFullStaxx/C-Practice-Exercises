public class ArmstrongNDigitNumber {
    public static void main(String[] args) {
        int num = 1634;
        int digits = countDigits(num);
        boolean isArmstrong = isArmstrongNDigitNumber(num, digits);

        System.out.println(num + " is an Armstrong number with " + digits + " digits? " + isArmstrong);
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean isArmstrongNDigitNumber(int num, int n) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == originalNum;
    }
}
