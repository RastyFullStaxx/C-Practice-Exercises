class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    String originalURL;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        originalURL = null;
    }
}

public class URLShortener {
    public static void main(String[] args) {
        URLShortener shortener = new URLShortener();

        String shortURL1 = shortener.shortenURL("https://www.example.com/page1");
        String shortURL2 = shortener.shortenURL("https://www.example.com/page2");

        String originalURL1 = shortener.expandURL(shortURL1);
        String originalURL2 = shortener.expandURL(shortURL2);

        System.out.println("Shortened URL for 'https://www.example.com/page1': " + shortURL1);
        System.out.println("Expanded URL for '" + shortURL1 + "': " + originalURL1);
        System.out.println("Shortened URL for 'https://www.example.com/page2': " + shortURL2);
        System.out.println("Expanded URL for '" + shortURL2 + "': " + originalURL2);
    }

    private TrieNode root;
    private static final String SHORT_URL_PREFIX = "https://short.url/";

    public URLShortener() {
        // Implement a constructor to initialize the Trie
    }

    public String shortenURL(String originalURL) {
        // Implement a method to shorten a URL using the Trie
        return null;
    }

    public String expandURL(String shortURL) {
        // Implement a method to expand a shortened URL using the Trie
        return null;
    }
}
