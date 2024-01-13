class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Map<String, Integer> wordContext;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        wordContext = new HashMap<>();
    }
}

public class AutocompleteWithContext {
    public static void main(String[] args) {
        String[] words = {"apple", "apricot", "banana", "apex", "aperture"};
        int[] contextValues = {3, 5, 2, 1, 4};

        AutocompleteWithContext autocomplete = new AutocompleteWithContext(words, contextValues);

        System.out.println("Suggestions for 'ap': " + autocomplete.getSuggestions("ap")); // Should return ["apricot", "apple", "aperture", "apex"]
        System.out.println("Suggestions for 'b': " + autocomplete.getSuggestions("b")); // Should return ["banana"]
    }

    private TrieNode root;

    public AutocompleteWithContext(String[] words, int[] contextValues) {
        // Implement a constructor to build a Trie with context values from the given words and context values
    }

    public List<String> getSuggestions(String prefix) {
        // Implement a method to get suggestions for a given prefix, ordered by context value
        return null;
    }
}
