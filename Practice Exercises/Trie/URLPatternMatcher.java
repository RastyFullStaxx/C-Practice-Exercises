class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    String pattern;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        pattern = null;
    }
}

public class URLPatternMatcher {
    public static void main(String[] args) {
        URLPatternMatcher patternMatcher = new URLPatternMatcher();

        patternMatcher.addPattern("/user/{userId}");
        patternMatcher.addPattern("/product/{productId}");

        String matchedPattern1 = patternMatcher.matchPattern("/user/123");
        String matchedPattern2 = patternMatcher.matchPattern("/product/456");

        System.out.println("Matched pattern for '/user/123': " + matchedPattern1); // Should return "/user/{userId}"
        System.out.println("Matched pattern for '/product/456': " + matchedPattern2); // Should return "/product/{productId}"
    }

    private TrieNode root;

    public URLPatternMatcher() {
        // Implement a constructor to initialize the Trie
    }

    public void addPattern(String pattern) {
        // Implement a method to add a URL pattern to the Trie
    }

    public String matchPattern(String url) {
        // Implement a method to match a URL to a pattern in the Trie
        return null;
    }
}
