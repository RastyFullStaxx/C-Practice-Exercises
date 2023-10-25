public class HappyNumberChecker {
    public static void main(String[] args) {
        int num = 19;
        boolean isHappy = isHappyNumber(num);

        System.out.println(num + " is a happy number? " + isHappy);
    }

    public static boolean isHappyNumber(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int digitSquareSum(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}
