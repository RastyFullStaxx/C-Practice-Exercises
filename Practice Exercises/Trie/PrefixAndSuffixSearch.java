class TrieNode {
    TrieNode[] children;
    int weight;

    TrieNode() {
        children = new TrieNode[27];
        weight = 0;
    }
}

public class PrefixAndSuffixSearch {
    public static void main(String[] args) {
        String[] words = {"apple", "ap", "app", "appl", "appla"};

        System.out.println("Array of Words: " + Arrays.toString(words));
        WordFilter wordFilter = new WordFilter(words);
        System.out.println("Prefix and Suffix Search: " + wordFilter.f("ap", "le")); // Should return 0
    }
}

class WordFilter {
    TrieNode trie;

    public WordFilter(String[] words) {
        // Implement a constructor to build a trie from given words
    }

    public int f(String prefix, String suffix) {
        // Implement a method to find the weight of the word with given prefix and suffix
        return 0;
    }
}
