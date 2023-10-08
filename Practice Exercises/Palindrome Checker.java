public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = isPalindrome(str);

        System.out.println("'" + str + "' is a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
