class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class RegularExpressionMatcher {
    public static void main(String[] args) {
        RegularExpressionMatcher matcher = new RegularExpressionMatcher();

        System.out.println("Is 'ab' matched by 'a*b'? " + matcher.isMatch("ab", "a*b")); // Should return true
        System.out.println("Is 'mississippi' matched by 'mis*is*p*.'? " + matcher.isMatch("mississippi", "mis*is*p*.")); // Should return false
    }

    private TrieNode root;

    public RegularExpressionMatcher() {
        // Implement a constructor to initialize the Trie
    }

    public boolean isMatch(String s, String p) {
        // Implement a method to check if a string s matches the pattern p using the Trie
        return false;
    }
}
