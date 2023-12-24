import java.util.List;

public class SubstringConcatenationWords {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        System.out.println("String s: " + s);
        System.out.println("Array of Words: " + Arrays.toString(words));
        List<Integer> indices = findSubstring(s, words);
        System.out.println("Indices of Substrings: " + indices);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        // Implement a method to find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters
        return null;
    }
}
