class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<String> documentIndices;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        documentIndices = new HashSet<>();
    }
}

public class DocumentSearch {
    public static void main(String[] args) {
        DocumentSearch documentSearch = new DocumentSearch();

        documentSearch.indexDocument("document1", "This is a sample document.");
        documentSearch.indexDocument("document2", "Another example document for testing.");

        Set<String> searchResults = documentSearch.searchDocuments("sample document");
        System.out.println("Documents containing 'sample document': " + searchResults); // Should return ["document1"]
    }

    private TrieNode root;

    public DocumentSearch() {
        // Implement a constructor to initialize the Trie
    }

    public void indexDocument(String documentId, String content) {
        // Implement a method to index a document in the Trie
    }

    public Set<String> searchDocuments(String query) {
        // Implement a method to search for documents containing a given query in the Trie
        return null;
    }
}
