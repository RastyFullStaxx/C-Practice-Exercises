import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Character frequencies: " + countCharacters(str));
    }
}
