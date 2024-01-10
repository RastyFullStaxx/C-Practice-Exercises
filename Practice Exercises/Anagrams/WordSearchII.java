public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";

        System.out.println("Word Search Board:");
        printBoard(board);
        boolean exists = exist(board, word);
        System.out.println("Does Word Exist: " + exists);
    }

    public static boolean exist(char[][] board, String word) {
        // Implement a method to check if the word exists in the word search board
        return false;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
