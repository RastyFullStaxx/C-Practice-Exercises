class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    int frequency;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        frequency = 0;
    }
}

public class CompressedStringStorage {
    public static void main(String[] args) {
        CompressedStringStorage stringStorage = new CompressedStringStorage();

        stringStorage.insertString("apple");
        stringStorage.insertString("app");
        stringStorage.insertString("apricot");

        System.out.println("Frequency of 'apple': " + stringStorage.getStringFrequency("apple")); // Should return 1
        System.out.println("Frequency of 'app': " + stringStorage.getStringFrequency("app")); // Should return 2
        System.out.println("Frequency of 'apricot': " + stringStorage.getStringFrequency("apricot")); // Should return 1
    }

    private TrieNode root;

    public CompressedStringStorage() {
        // Implement a constructor to initialize the Trie
    }

    public void insertString(String word) {
        // Implement a method to insert a string into the Trie and maintain frequency
    }

    public int getStringFrequency(String word) {
        // Implement a method to get the frequency of a string in the Trie
        return 0;
    }
}
