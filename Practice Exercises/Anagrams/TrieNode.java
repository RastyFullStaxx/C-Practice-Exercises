class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class Trie {
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
