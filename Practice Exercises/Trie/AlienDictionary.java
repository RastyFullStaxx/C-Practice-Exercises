import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children;
    int inDegree;

    TrieNode() {
        children = new HashMap<>();
        inDegree = 0;
    }
}

public class AlienDictionary {
    public static void main(String[] args) {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};

        System.out.println("Array of Words: " + Arrays.toString(words));
        String alienOrder = alienOrder(words);
        System.out.println("Alien Dictionary Order: \"" + alienOrder + "\"");
    }

    public static String alienOrder(String[] words) {
        // Implement a method to determine the order of characters in an alien language
        return null;
    }
}
