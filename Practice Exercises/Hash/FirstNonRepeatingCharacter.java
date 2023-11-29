import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "programming";

        char firstNonRepeating = findFirstNonRepeating(str);

        System.out.println("First non-repeating character: " + firstNonRepeating);
    }

    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
