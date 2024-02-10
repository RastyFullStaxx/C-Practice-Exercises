public class HappyNumberChecker {
    public static boolean isHappyNumber(int num) {
        while (num != 1 && num != 4) {
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int number = 19;
        System.out.println(number + " is a happy number: " + isHappyNumber(number));
    }
}
