public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = isPalindrome(word);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
