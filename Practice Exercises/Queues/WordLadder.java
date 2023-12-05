import java.util.*;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int ladderLength = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                char[] currentWord = queue.poll().toCharArray();

                for (int j = 0; j < currentWord.length; j++) {
                    char originalChar = currentWord[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        currentWord[j] = c;
                        String nextWord = new String(currentWord);

                        if (nextWord.equals(endWord)) {
                            return ladderLength + 1;
                        }

                        if (wordSet.contains(nextWord)) {
                            queue.offer(nextWord);
                            wordSet.remove(nextWord);
                        }
                    }

                    currentWord[j] = originalChar;
                }
            }

            ladderLength++;
        }

        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println("Length of the shortest transformation sequence: " +
                ladderLength(beginWord, endWord, wordList)); // Output: 5
    }
}
