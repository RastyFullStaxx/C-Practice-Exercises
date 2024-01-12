class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        // Implement a method to insert a word into the trie
    }

    public boolean search(String word) {
        // Implement a method to search for a word in the trie
        return false;
    }

    public boolean startsWith(String prefix) {
        // Implement a method to check if there is any word in the trie that starts with the given prefix
        return false;
    }
}

public class TrieImplementation {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println("Search 'apple': " + trie.search("apple")); // Should return true
        System.out.println("Search 'app': " + trie.search("app")); // Should return false
        System.out.println("StartsWith 'app': " + trie.startsWith("app")); // Should return true

        trie.insert("app");
        System.out.println("Search 'app': " + trie.search("app")); // Should return true
    }
}
