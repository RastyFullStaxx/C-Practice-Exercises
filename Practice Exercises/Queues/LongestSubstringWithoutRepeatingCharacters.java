import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0, j = 0; j < n; j++) {
            if (charIndexMap.containsKey(s.charAt(j))) {
                i = Math.max(charIndexMap.get(s.charAt(j)), i);
            }

            maxLength = Math.max(maxLength, j - i + 1);
            charIndexMap.put(s.charAt(j), j + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " +
                lengthOfLongestSubstring(s)); // Output: 3
    }
}
