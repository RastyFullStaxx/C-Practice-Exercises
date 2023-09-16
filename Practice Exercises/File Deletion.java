import java.io.File;

public class FileDeletionExample {
    public static void main(String[] args) {
        File fileToDelete = new File("fileToDelete.txt");

        if (fileToDelete.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.err.println("Failed to delete the file.");
        }
    }
}
