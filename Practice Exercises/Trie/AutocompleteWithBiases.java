class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Map<String, Integer> wordBias;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        wordBias = new HashMap<>();
    }
}

public class AutocompleteWithBiases {
    public static void main(String[] args) {
        String[] words = {"apple", "apricot", "banana", "apex", "aperture"};
        int[] biases = {3, 5, 2, 1, 4};

        AutocompleteWithBiases autocomplete = new AutocompleteWithBiases(words, biases);

        System.out.println("Suggestions for 'ap': " + autocomplete.getSuggestions("ap")); // Should return ["apricot", "apple", "aperture", "apex"]
        System.out.println("Suggestions for 'b': " + autocomplete.getSuggestions("b")); // Should return ["banana"]
    }

    private TrieNode root;

    public AutocompleteWithBiases(String[] words, int[] biases) {
        // Implement a constructor to build a Trie with biases from the given words and biases
    }

    public List<String> getSuggestions(String prefix) {
        // Implement a method to get suggestions for a given prefix, ordered by bias
        return null;
    }
}
