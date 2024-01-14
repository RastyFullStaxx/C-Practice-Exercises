class TrieNode {
    Map<String, TrieNode> children;
    boolean isEnd;
    String content;

    TrieNode() {
        children = new HashMap<>();
        isEnd = false;
        content = null;
    }
}

public class FileSystem {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();

        fileSystem.addFile("/home/user/documents/file1.txt", "This is the content of file1.");
        fileSystem.addFile("/home/user/images/photo.jpg", "Image content goes here.");

        String content1 = fileSystem.readFile("/home/user/documents/file1.txt");
        String content2 = fileSystem.readFile("/home/user/images/photo.jpg");

        System.out.println("Content of file1.txt: " + content1);
        System.out.println("Content of photo.jpg: " + content2);
    }

    private TrieNode root;

    public FileSystem() {
        // Implement a constructor to initialize the Trie
    }

    public void addFile(String filePath, String content) {
        // Implement a method to add a file with content to the Trie
    }

    public String readFile(String filePath) {
        // Implement a method to read the content of a file from the Trie
        return null;
    }
}
