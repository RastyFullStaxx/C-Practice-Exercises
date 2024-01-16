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

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyCounter frequencyCounter = new WordFrequencyCounter();

        frequencyCounter.addWord("apple");
        frequencyCounter.addWord("banana");
        frequencyCounter.addWord("apple");

        int frequency1 = frequencyCounter.getWordFrequency("apple");
        int frequency2 = frequencyCounter.getWordFrequency("banana");

        System.out.println("Frequency of 'apple': " + frequency1); // Should return 2
        System.out.println("Frequency of 'banana': " + frequency2); // Should return 1
    }

    private TrieNode root;

    public WordFrequencyCounter() {
        // Implement a constructor to initialize the Trie
    }

    public void addWord(String word) {
        // Implement a method to add a word to the Trie and maintain frequency
    }

    public int getWordFrequency(String word) {
        // Implement a method to get the frequency of a word in the Trie
        return 0;
    }
}
