class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<String> emailAddresses;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        emailAddresses = new HashSet<>();
    }
}

public class EmailSuggestionSystem {
    public static void main(String[] args) {
        EmailSuggestionSystem suggestionSystem = new EmailSuggestionSystem();

        suggestionSystem.addEmailAddress("john.doe@example.com");
        suggestionSystem.addEmailAddress("jane.doe@example.com");
        suggestionSystem.addEmailAddress("john.smith@example.com");

        Set<String> suggestions1 = suggestionSystem.getSuggestions("john"); // Should return ["john.doe@example.com", "john.smith@example.com"]
        Set<String> suggestions2 = suggestionSystem.getSuggestions("jane"); // Should return ["jane.doe@example.com"]

        System.out.println("Suggestions for 'john': " + suggestions1);
        System.out.println("Suggestions for 'jane': " + suggestions2);
    }

    private TrieNode root;

    public EmailSuggestionSystem() {
        // Implement a constructor to initialize the Trie
    }

    public void addEmailAddress(String emailAddress) {
        // Implement a method to add an email address to the Trie
    }

    public Set<String> getSuggestions(String prefix) {
        // Implement a method to get email address suggestions for a given prefix from the Trie
        return null;
    }
}
