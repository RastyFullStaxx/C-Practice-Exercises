public class HarshadNumberChecker {
    public static boolean isHarshadNumber(int num) {
        int sumOfDigits = 0;
        int temp = num;
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return num % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        int number = 18;
        System.out.println(number + " is a Harshad number: " + isHarshadNumber(number));
    }
}
