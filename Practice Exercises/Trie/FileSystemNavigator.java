class TrieNode {
    Map<String, TrieNode> children;
    boolean isEnd;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}

public class FileSystemNavigator {
    public static void main(String[] args) {
        FileSystemNavigator fileSystemNavigator = new FileSystemNavigator();

        fileSystemNavigator.addFile("/root/folder1/file1.txt");
        fileSystemNavigator.addFile("/root/folder1/file2.txt");
        fileSystemNavigator.addFile("/root/folder2/file3.txt");

        List<String> filesInFolder1 = fileSystemNavigator.listFiles("/root/folder1");
        System.out.println("Files in '/root/folder1': " + filesInFolder1); // Should return ["file1.txt", "file2.txt"]
    }

    private TrieNode root;

    public FileSystemNavigator() {
        // Implement a constructor to initialize the Trie
    }

    public void addFile(String filePath) {
        // Implement a method to add a file to the Trie
    }

    public List<String> listFiles(String folderPath) {
        // Implement a method to list files in a given folder path from the Trie
        return null;
    }
}
