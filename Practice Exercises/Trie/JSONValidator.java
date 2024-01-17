class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class JSONValidator {
    public static void main(String[] args) {
        JSONValidator jsonValidator = new JSONValidator();

        String json1 = "{\"name\": \"John\", \"age\": 25, \"city\": \"New York\"}";
        String json2 = "{\"name\": \"Jane\", \"age\": 30, \"city\": \"Los Angeles\", \"married\": true}";

        boolean isValid1 = jsonValidator.isValidJSON(json1);
        boolean isValid2 = jsonValidator.isValidJSON(json2);

        System.out.println("Is JSON1 valid? " + isValid1); // Should return true
        System.out.println("Is JSON2 valid? " + isValid2); // Should return true
    }

    private TrieNode root;

    public JSONValidator() {
        // Implement a constructor to initialize the Trie
    }

    public boolean isValidJSON(String json) {
        // Implement a method to validate JSON syntax using the Trie
        return false;
    }
}
