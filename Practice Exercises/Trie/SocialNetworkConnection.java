class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    Set<String> connections;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        connections = new HashSet<>();
    }
}

public class SocialNetworkConnection {
    public static void main(String[] args) {
        SocialNetworkConnection networkConnection = new SocialNetworkConnection();

        networkConnection.addConnection("user1", "user2");
        networkConnection.addConnection("user1", "user3");
        networkConnection.addConnection("user2", "user3");

        System.out.println("Common connections between 'user1' and 'user2': " + networkConnection.getCommonConnections("user1", "user2")); // Should return ["user3"]
        System.out.println("Common connections between 'user1' and 'user4': " + networkConnection.getCommonConnections("user1", "user4")); // Should return []
    }

    private TrieNode root;

    public SocialNetworkConnection() {
        // Implement a constructor to initialize the Trie
    }

    public void addConnection(String user1, String user2) {
        // Implement a method to add a connection between two users in the Trie
    }

    public Set<String> getCommonConnections(String user1, String user2) {
        // Implement a method to get common connections between two users in the Trie
        return null;
    }
}
