class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Map<String, Integer> playerScores;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        playerScores = new HashMap<>();
    }
}

public class GameLeaderboard {
    public static void main(String[] args) {
        GameLeaderboard leaderboard = new GameLeaderboard();

        leaderboard.updateScore("player1", 100);
        leaderboard.updateScore("player2", 150);
        leaderboard.updateScore("player3", 120);

        System.out.println("Top 2 Players: " + leaderboard.getTopPlayers(2)); // Should return ["player2", "player1"]
    }

    private TrieNode root;

    public GameLeaderboard() {
        // Implement a constructor to initialize the Trie
    }

    public void updateScore(String playerName, int score) {
        // Implement a method to update the score of a player in the Trie
    }

    public List<String> getTopPlayers(int k) {
        // Implement a method to get the top k players from the Trie based on scores
        return null;
    }
}
