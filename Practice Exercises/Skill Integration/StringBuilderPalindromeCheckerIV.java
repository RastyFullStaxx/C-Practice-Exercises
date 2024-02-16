public class StringBuilderPalindromeChecker {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String str = "level";
        System.out.println("'" + str + "' is a palindrome: " + isPalindrome(str));
    }
}
