public class CaseInsensitivePalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        boolean isPalindrome = isCaseInsensitivePalindrome(str);

        System.out.println("'" + str + "' is a case-insensitive palindrome? " + isPalindrome);
    }

    public static boolean isCaseInsensitivePalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
