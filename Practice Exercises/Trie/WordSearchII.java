import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class WordSearchII {
    public static void main(String[] args) {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};

        System.out.println("Word Search Board:");
        printBoard(board);
        System.out.println("Array of Words: " + Arrays.toString(words));
        List<String> foundWords = findWords(board, words);
        System.out.println("Found Words: " + foundWords);
    }

    public static List<String> findWords(char[][] board, String[] words) {
        // Implement a method to find words in the word search board using the given dictionary
        return null;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
