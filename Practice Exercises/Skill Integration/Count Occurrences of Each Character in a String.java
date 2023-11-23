import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrencesCounter {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> occurrences = countCharacterOccurrences(str);

        System.out.println("Character occurrences in the string:");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> occurrences = new HashMap<>();

        for (char c : str.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }

        return occurrences;
    }
}
