public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        boolean isArmstrong = isArmstrongNumber(num);

        System.out.println(num + " is an Armstrong number? " + isArmstrong);
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        return result == num;
    }
}
