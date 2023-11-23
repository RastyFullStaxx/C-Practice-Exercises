public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "abba";
        int count = countPalindromicSubstrings(str);

        System.out.println("Number of palindromic substrings in the string: " + count);
    }

    public static int countPalindromicSubstrings(String str) {
        int count = 0;
        int n = str.length();

        for (int center = 0; center <= 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
