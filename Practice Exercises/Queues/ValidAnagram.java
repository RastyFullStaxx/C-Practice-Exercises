import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) - 1);
            if (countMap.get(ch) == 0) {
                countMap.remove(ch);
            }
        }

        return countMap.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Are the strings valid anagrams? " + isAnagram(s, t)); // Output: true
    }
}
