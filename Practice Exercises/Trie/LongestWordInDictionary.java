import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class LongestWordInDictionary {
    public static void main(String[] args) {
        String[] words = {"w", "wo", "wor", "worl", "world"};

        System.out.println("Array of Words: " + Arrays.toString(words));
        String longestWord = longestWord(words);
        System.out.println("Longest Word in Dictionary: " + longestWord);
    }

    public static String longestWord(String[] words) {
        // Implement a method to find the longest word in the dictionary that can be built one character at a time
        return null;
    }
}
