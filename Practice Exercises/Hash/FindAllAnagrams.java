import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> anagramIndices = findAnagrams(s, p);

        System.out.println("Indices of all anagrams of 'abc': " + anagramIndices);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramIndices = new ArrayList<>();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : p.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int requiredChars = p.length();

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (charCount.containsKey(currentChar)) {
                if (charCount.get(currentChar) > 0) {
                    requiredChars--;
                }
                charCount.put(currentChar, charCount.get(currentChar) - 1);
            }

            while (requiredChars == 0) {
                if (right - left + 1 == p.length()) {
                    anagramIndices.add(left);
                }

                char leftChar = s.charAt(left);
                if (charCount.containsKey(leftChar)) {
                    charCount.put(leftChar, charCount.get(leftChar) + 1);
                    if (charCount.get(leftChar) > 0) {
                        requiredChars++;
                    }
                }

                left++;
            }

            right++;
        }

        return anagramIndices;
    }
}
