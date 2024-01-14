class TrieNode {
    Map<String, TrieNode> children;
    boolean isEnd;
    Set<String> files;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        files = new HashSet<>();
    }
}

public class DirectoryStructure {
    public static void main(String[] args) {
        DirectoryStructure directoryStructure = new DirectoryStructure();

        directoryStructure.addFile("/home/user/documents/file1.txt");
        directoryStructure.addFile("/home/user/documents/file2.txt");
        directoryStructure.addFile("/home/user/images/photo.jpg");

        Set<String> result1 = directoryStructure.listFiles("/home/user/documents"); // Should return ["file1.txt", "file2.txt"]
        Set<String> result2 = directoryStructure.listFiles("/home/user/images"); // Should return ["photo.jpg"]

        System.out.println("Files in '/home/user/documents': " + result1);
        System.out.println("Files in '/home/user/images': " + result2);
    }

    private TrieNode root;

    public DirectoryStructure() {
        // Implement a constructor to initialize the Trie
    }

    public void addFile(String filePath) {
        // Implement a method to add a file to the Trie
    }

    public Set<String> listFiles(String directoryPath) {
        // Implement a method to list files in a given directory path from the Trie
        return null;
    }
}
