class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEnd;
    List<String> commandHistory;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        commandHistory = new ArrayList<>();
    }
}

public class CommandLineHistory {
    public static void main(String[] args) {
        CommandLineHistory commandHistory = new CommandLineHistory();

        commandHistory.addCommand("java Main");
        commandHistory.addCommand("cd /home/user");
        commandHistory.addCommand("ls");

        List<String> history = commandHistory.getCommandHistory();
        System.out.println("Command history: " + history); // Should return ["java Main", "cd /home/user", "ls"]
    }

    private TrieNode root;

    public CommandLineHistory() {
        // Implement a constructor to initialize the Trie
    }

    public void addCommand(String command) {
        // Implement a method to add a command to the Trie
    }

    public List<String> getCommandHistory() {
        // Implement a method to get the command history from the Trie
        return null;
    }
}
