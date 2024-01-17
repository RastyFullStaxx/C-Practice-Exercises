class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    int depth;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        depth = 0;
    }
}

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        PasswordStrengthChecker strengthChecker = new PasswordStrengthChecker();

        boolean isStrong1 = strengthChecker.isStrongPassword("SecurePass123");
        boolean isStrong2 = strengthChecker.isStrongPassword("weak123");

        System.out.println("Is 'SecurePass123' a strong password? " + isStrong1); // Should return true
        System.out.println("Is 'weak123' a strong password? " + isStrong2); // Should return false
    }

    private TrieNode root;

    public PasswordStrengthChecker() {
        // Implement a constructor to initialize the Trie
    }

    public boolean isStrongPassword(String password) {
        // Implement a method to check if a password is strong using the Trie
        return false;
    }
}
