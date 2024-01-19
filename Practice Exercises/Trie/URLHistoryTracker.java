class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class URLHistoryTracker {
    public static void main(String[] args) {
        URLHistoryTracker historyTracker = new URLHistoryTracker();

        historyTracker.visitURL("https://www.example.com");
        historyTracker.visitURL("https://www.example.com/page1");
        historyTracker.visitURL("https://www.example.com/page2");

        List<String> history = historyTracker.getHistory();
        System.out.println("Browsing history: " + history); // Should return ["https://www.example.com", "https://www.example.com/page1", "https://www.example.com/page2"]
    }

    private TrieNode root;

    public URLHistoryTracker() {
        // Implement a constructor to initialize the Trie
    }

    public void visitURL(String url) {
        // Implement a method to track URL visits and update the Trie
    }

    public List<String> getHistory() {
        // Implement a method to get the browsing history from the Trie
        return null;
    }
}
