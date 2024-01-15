class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        WordSearch wordSearch = new WordSearch();

        System.out.println("Does the board contain the word 'ABCCED'? " + wordSearch.exist(board, "ABCCED")); // Should return true
        System.out.println("Does the board contain the word 'SEE'? " + wordSearch.exist(board, "SEE")); // Should return true
        System.out.println("Does the board contain the word 'ABCB'? " + wordSearch.exist(board, "ABCB")); // Should return false
    }

    private TrieNode root;

    public WordSearch() {
        // Implement a constructor to initialize the Trie
    }

    public boolean exist(char[][] board, String word) {
        // Implement a method to check if a word exists on the board using the Trie
        return false;
    }
}
