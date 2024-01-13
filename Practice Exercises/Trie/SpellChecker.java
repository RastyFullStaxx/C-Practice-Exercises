import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<String> words;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        words = new HashSet<>();
    }
}

public class SpellChecker {
    public static void main(String[] args) {
        String[] dictionary = {"apple", "orange", "banana", "grape", "pear"};
        SpellChecker spellChecker = new SpellChecker(dictionary);

        System.out.println("Is 'appel' Correct? " + spellChecker.isCorrect("appel")); // Should return true
        System.out.println("Is 'bannana' Correct? " + spellChecker.isCorrect("bannana")); // Should return false
        System.out.println("Suggestions for 'orane': " + spellChecker.getSuggestions("orane")); // Should return ["orange"]
    }

    private TrieNode root;

    public SpellChecker(String[] words) {
        // Implement a constructor to build a Trie for the given dictionary
    }

    public boolean isCorrect(String word) {
        // Implement a method to check if a word is correct based on the dictionary
        return false;
    }

    public List<String> getSuggestions(String prefix) {
        // Implement a method to get suggestions for a given prefix
        return null;
    }
}
