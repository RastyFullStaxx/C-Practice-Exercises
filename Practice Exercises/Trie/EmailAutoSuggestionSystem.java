class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    List<String> emailSuggestions;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        emailSuggestions = new ArrayList<>();
    }
}

public class EmailAutoSuggestionSystem {
    public static void main(String[] args) {
        EmailAutoSuggestionSystem autoSuggestionSystem = new EmailAutoSuggestionSystem();

        autoSuggestionSystem.addEmail("john.doe@example.com");
        autoSuggestionSystem.addEmail("jane.smith@example.com");
        autoSuggestionSystem.addEmail("jason.white@example.com");

        List<String> suggestions = autoSuggestionSystem.getSuggestions("ja");
        System.out.println("Email suggestions for 'ja': " + suggestions); // Should return ["jane.smith@example.com", "jason.white@example.com"]
    }

    private TrieNode root;

    public EmailAutoSuggestionSystem() {
        // Implement a constructor to initialize the Trie
    }

    public void addEmail(String email) {
        // Implement a method to add an email to the Trie
    }

    public List<String> getSuggestions(String prefix) {
        // Implement a method to get email suggestions for a given prefix from the Trie
        return null;
    }
}
