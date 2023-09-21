public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = isPalindrome(input);

        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
