class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class UserAuthentication {
    public static void main(String[] args) {
        UserAuthentication userAuthentication = new UserAuthentication();

        userAuthentication.registerUser("user1", "password123");
        userAuthentication.registerUser("user2", "pass456");

        System.out.println("Is 'user1' valid? " + userAuthentication.isValidUser("user1", "password123")); // Should return true
        System.out.println("Is 'user2' valid? " + userAuthentication.isValidUser("user2", "pass789")); // Should return false
    }

    private TrieNode root;

    public UserAuthentication() {
        // Implement a constructor to initialize the Trie
    }

    public void registerUser(String username, String password) {
        // Implement a method to register a user and store their credentials in the Trie
    }

    public boolean isValidUser(String username, String password) {
        // Implement a method to check if a given username and password combination is valid
        return false;
    }
}
