public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 12321;
        boolean isPalindrome = isNumberPalindrome(num);

        System.out.println(num + " is a palindrome? " + isPalindrome);
    }

    public static boolean isNumberPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
