import java.util.List;

public class WordLadder {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        System.out.println("Begin Word: " + beginWord);
        System.out.println("End Word: " + endWord);
        System.out.println("Word List: " + wordList);
        int ladderLength = ladderLength(beginWord, endWord, wordList);
        System.out.println("Length of Word Ladder: " + ladderLength);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Implement a method to find the length of the shortest transformation sequence from beginWord to endWord
        return 0;
    }
}
