import java.util.List;

public class WordSearchII {
    public static void main(String[] args) {
        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        String[] words = {"oath","pea","eat","rain"};

        System.out.println("Board: " + Arrays.deepToString(board));
        System.out.println("Array of Words: " + Arrays.toString(words));
        List<String> foundWords = findWords(board, words);
        System.out.println("Found Words: " + foundWords);
    }

    public static List<String> findWords(char[][] board, String[] words) {
        // Implement a method to find all words from the given array in the 2D board
        return null;
    }
}
