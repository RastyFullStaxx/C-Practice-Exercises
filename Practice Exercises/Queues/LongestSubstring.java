import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);

        System.out.println("Length of Longest Substring: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0, j = 0; j < n; j++) {
            if (charIndexMap.containsKey(s.charAt(j))) {
                i = Math.max(charIndexMap.get(s.charAt(j)) + 1, i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            charIndexMap.put(s.charAt(j), j);
        }

        return maxLength;
    }
}
