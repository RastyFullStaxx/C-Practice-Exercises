public class PalindromicNumber {
    public static void main(String[] args) {
        int num = 12321;
        boolean isPalindromic = isPalindromicNumber(num);

        System.out.println(num + " is a palindromic number? " + isPalindromic);
    }

    public static boolean isPalindromicNumber(int num) {
        int reversed = 0;
        int original = num;

        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        return original == reversed;
    }
}
