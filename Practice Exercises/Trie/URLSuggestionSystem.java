class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<String> urls;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        urls = new HashSet<>();
    }
}

public class URLSuggestionSystem {
    public static void main(String[] args) {
        URLSuggestionSystem suggestionSystem = new URLSuggestionSystem();

        suggestionSystem.addURL("https://www.example.com/page1");
        suggestionSystem.addURL("https://www.example.com/page2");
        suggestionSystem.addURL("https://www.example.net/page3");

        Set<String> suggestions1 = suggestionSystem.getSuggestions("https://www.example");
        Set<String> suggestions2 = suggestionSystem.getSuggestions("https://www.example.net");

        System.out.println("URL suggestions for 'https://www.example': " + suggestions1);
        System.out.println("URL suggestions for 'https://www.example.net': " + suggestions2);
    }

    private TrieNode root;

    public URLSuggestionSystem() {
        // Implement a constructor to initialize the Trie
    }

    public void addURL(String url) {
