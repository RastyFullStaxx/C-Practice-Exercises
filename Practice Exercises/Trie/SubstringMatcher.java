class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class SubstringMatcher {
    public static void main(String[] args) {
        SubstringMatcher substringMatcher = new SubstringMatcher();

        substringMatcher.addSubstring("apple");
        substringMatcher.addSubstring("banana");
        substringMatcher.addSubstring("orange");

        boolean hasSubstring1 = substringMatcher.containsSubstring("app");
        boolean hasSubstring2 = substringMatcher.containsSubstring("berry");

        System.out.println("Contains substring 'app': " + hasSubstring1); // Should return true
        System.out.println("Contains substring 'berry': " + hasSubstring2); // Should return false
    }

    private TrieNode root;

    public SubstringMatcher() {
        // Implement a constructor to initialize the Trie
    }

    public void addSubstring(String substring) {
        // Implement a method to add a substring to the Trie
    }

    public boolean containsSubstring(String query) {
        // Implement a method to check if any substring matches the given query in the Trie
        return false;
    }
}
