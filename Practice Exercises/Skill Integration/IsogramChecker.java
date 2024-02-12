import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {
    public static boolean isIsogram(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (!set.add(Character.toLowerCase(ch))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "programming";
        System.out.println("'" + word + "' is an isogram: " + isIsogram(word));
    }
}
