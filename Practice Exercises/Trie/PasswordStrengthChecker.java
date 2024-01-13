class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        PasswordStrengthChecker passwordChecker = new PasswordStrengthChecker();

        System.out.println("Is 'StrongPass123' Strong? " + passwordChecker.isStrongPassword("StrongPass123")); // Should return true
        System.out.println("Is 'weakpass' Strong? " + passwordChecker.isStrongPassword("weakpass")); // Should return false
    }

    private TrieNode root;
    private static final int MIN_LENGTH = 8;

    public PasswordStrengthChecker() {
        // Implement a constructor to initialize the Trie
    }

    public boolean isStrongPassword(String password) {
        // Implement a method to check if a password is strong based on certain criteria
        return false;
    }

    private void insertIntoTrie(String word) {
        // Implement a method to insert a word into the Trie
    }
}
