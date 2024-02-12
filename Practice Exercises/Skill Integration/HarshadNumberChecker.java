public class HarshadNumberChecker {
    public static boolean isHarshadNumber(int num) {
        int sumOfDigits = 0;
        int originalNum = num;
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        return originalNum % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        int number = 18;
        System.out.println(number + " is a Harshad number: " + isHarshadNumber(number));
    }
}
