class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class PrefixMatchingSystem {
    public static void main(String[] args) {
        PrefixMatchingSystem matchingSystem = new PrefixMatchingSystem();

        matchingSystem.addWord("apple");
        matchingSystem.addWord("appetizer");
        matchingSystem.addWord("apricot");

        List<String> matches1 = matchingSystem.findWordsWithPrefix("app");
        List<String> matches2 = matchingSystem.findWordsWithPrefix("ban");

        System.out.println("Words with prefix 'app': " + matches1); // Should return ["apple", "appetizer", "apricot"]
        System.out.println("Words with prefix 'ban': " + matches2); // Should return []
    }

    private TrieNode root;

    public PrefixMatchingSystem() {
        // Implement a constructor to initialize the Trie
    }

    public void addWord(String word) {
        // Implement a method to add words to the Trie for prefix matching
    }

    public List<String> findWordsWithPrefix(String prefix) {
        // Implement a method to find words with a given prefix in the Trie
        return null;
    }
}
