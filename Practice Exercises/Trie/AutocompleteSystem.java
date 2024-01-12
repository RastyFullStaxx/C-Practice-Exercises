import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Map<String, Integer> wordFrequency;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        wordFrequency = new HashMap<>();
    }
}

public class AutocompleteSystem {
    public static void main(String[] args) {
        String[] sentences = {"i love you", "island", "ironman", "i love leetcode"};
        int[] times = {5, 3, 2, 2};

        AutocompleteSystem autocompleteSystem = new AutocompleteSystem(sentences, times);

        System.out.println("Input: 'i'");
        System.out.println("Autocomplete Suggestions: " + autocompleteSystem.input('i'));
        System.out.println("Input: ' '");
        System.out.println("Autocomplete Suggestions: " + autocompleteSystem.input(' '));
        System.out.println("Input: 'a'");
        System.out.println("Autocomplete Suggestions: " + autocompleteSystem.input('a'));
    }

    public AutocompleteSystem(String[] sentences, int[] times) {
        // Implement a constructor to build a Trie map and initialize autocomplete system
    }

    public List<String> input(char c) {
        // Implement a method to process the input character and return autocomplete suggestions
        return null;
    }
}
