import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String minWindow = minWindowSubstring(s, t);

        System.out.println("Minimum window substring: " + minWindow);
    }

    public static String minWindowSubstring(String s, String t) {
        Map<Character, Integer> targetCharCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetCharCount.put(c, targetCharCount.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = t.length();

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (targetCharCount.containsKey(currentChar)) {
                if (targetCharCount.get(currentChar) > 0) {
                    requiredChars--;
                }
                targetCharCount.put(currentChar, targetCharCount.get(currentChar) - 1);
            }

            while (requiredChars == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                if (targetCharCount.containsKey(leftChar)) {
                    targetCharCount.put(leftChar, targetCharCount.get(leftChar) + 1);
                    if (targetCharCount.get(leftChar) > 0) {
                        requiredChars++;
                    }
                }

                left++;
            }

            right++;
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(minStart, minStart + minLen);
    }
}
