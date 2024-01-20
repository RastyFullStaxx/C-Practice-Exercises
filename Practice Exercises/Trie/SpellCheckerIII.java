class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class SpellChecker {
    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker();

        spellChecker.addToDictionary("programming");
        spellChecker.addToDictionary("algorithm");
        spellChecker.addToDictionary("java");

        boolean isSpelledCorrectly1 = spellChecker.isSpelledCorrectly("programeeng");
        boolean isSpelledCorrectly2 = spellChecker.isSpelledCorrectly("algoritm");
        boolean isSpelledCorrectly3 = spellChecker.isSpelledCorrectly("python");

        System.out.println("'programeeng' is spelled correctly: " + isSpelledCorrectly1); // Should return true
        System.out.println("'algoritm' is spelled correctly: " + isSpelledCorrectly2); // Should return true
        System.out.println("'python' is spelled correctly: " + isSpelledCorrectly3); // Should return false
    }

    private TrieNode root;

    public SpellChecker() {
        // Implement a constructor to initialize the Trie
    }

    public void addToDictionary(String word) {
        // Implement a method to add words to the spell checker dictionary using the Trie
    }

    public boolean isSpelledCorrectly(String word) {
        // Implement a method to check if a word is spelled correctly using the Trie
        return false;
    }
}
