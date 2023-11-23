import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = findPermutations(input);

        System.out.println("Permutations of '" + input + "':");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> findPermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutations("", input, permutations);
        return permutations;
    }

    private static void generatePermutations(String prefix, String remaining, List<String> result) {
        int length = remaining.length();
        if (length == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutations(newPrefix, newRemaining, result);
            }
        }
    }
}
