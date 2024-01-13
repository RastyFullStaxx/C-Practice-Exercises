class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Map<String, Integer> wordWeight;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        wordWeight = new HashMap<>();
    }
}

public class AutocompleteWithWeight {
    public static void main(String[] args) {
        String[] words = {"apple", "apricot", "banana", "apex", "aperture"};
        int[] weights = {3, 5, 2, 1, 4};

        AutocompleteWithWeight autocomplete = new AutocompleteWithWeight(words, weights);

        System.out.println("Suggestions for 'ap': " + autocomplete.getSuggestions("ap")); // Should return ["apricot", "apple", "aperture", "apex"]
        System.out.println("Suggestions for 'b': " + autocomplete.getSuggestions("b")); // Should return ["banana"]
    }

    private TrieNode root;

    public AutocompleteWithWeight(String[] words, int[] weights) {
        // Implement a constructor to build a Trie with weights from the given words and weights
    }

    public List<String> getSuggestions(String prefix) {
        // Implement a method to get suggestions for a given prefix, ordered by weight
        return null;
    }
}
