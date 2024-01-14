class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class LongestCommonPrefixFinder {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        LongestCommonPrefixFinder prefixFinder = new LongestCommonPrefixFinder();

        String longestCommonPrefix = prefixFinder.findLongestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + longestCommonPrefix); // Should return "fl"
    }

    private TrieNode root;

    public LongestCommonPrefixFinder() {
        // Implement a constructor to initialize the Trie
    }

    public String findLongestCommonPrefix(String[] words) {
        // Implement a method to find the longest common prefix among an array of words using the Trie
        return null;
    }
}
