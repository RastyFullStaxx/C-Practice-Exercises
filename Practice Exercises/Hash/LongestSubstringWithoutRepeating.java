import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int length = lengthOfLongestSubstring(s);

        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            if (charIndexMap.containsKey(s.charAt(end))) {
                start = Math.max(start, charIndexMap.get(s.charAt(end)) + 1);
            }

            charIndexMap.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
