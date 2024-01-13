class TrieNode {
    TrieNode[] children;
    int sum;

    TrieNode() {
        children = new TrieNode[10];
        sum = 0;
    }
}

public class TrieSumPrefix {
    public static void main(String[] args) {
        TrieSumPrefix trieSumPrefix = new TrieSumPrefix();
        trieSumPrefix.insert(123);
        trieSumPrefix.insert(456);
        trieSumPrefix.insert(789);

        System.out.println("Sum of Prefix '1': " + trieSumPrefix.sumPrefix(1)); // Should return 1368
        System.out.println("Sum of Prefix '12': " + trieSumPrefix.sumPrefix(12)); // Should return 1235
        System.out.println("Sum of Prefix '123': " + trieSumPrefix.sumPrefix(123)); // Should return 123
    }

    private TrieNode root;

    public TrieSumPrefix() {
        // Implement a constructor to initialize the Trie
    }

    public void insert(int num) {
        // Implement a method to insert a number into the Trie
    }

    public int sumPrefix(int prefix) {
        // Implement a method to calculate the sum of all numbers with a given prefix
        return 0;
    }
}
