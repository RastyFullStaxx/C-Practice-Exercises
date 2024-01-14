class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<Integer> documentIds;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        documentIds = new HashSet<>();
    }
}

public class DocumentRetrieval {
    public static void main(String[] args) {
        DocumentRetrieval documentRetrieval = new DocumentRetrieval();

        documentRetrieval.indexDocument("This is a sample document.", 1);
        documentRetrieval.indexDocument("Another document for testing purposes.", 2);

        Set<Integer> result1 = documentRetrieval.searchDocuments("sample"); // Should return [1]
        Set<Integer> result2 = documentRetrieval.searchDocuments("document"); // Should return [1, 2]

        System.out.println("Search Result for 'sample': " + result1);
        System.out.println("Search Result for 'document': " + result2);
    }

    private TrieNode root;

    public DocumentRetrieval() {
        // Implement a constructor to initialize the Trie
    }

    public void indexDocument(String document, int documentId) {
        // Implement a method to index a document and associate it with a document ID in the Trie
    }

    public Set<Integer> searchDocuments(String query) {
        // Implement a method to search for documents containing a given query in the Trie
        return null;
    }
}
