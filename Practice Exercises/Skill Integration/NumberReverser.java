public class NumberReverser {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reversed number: " + reverseNumber(number));
    }
}
