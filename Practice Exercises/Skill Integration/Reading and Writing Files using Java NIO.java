import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIOUsingNIO {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        String contentToWrite = "Hello, Java NIO!";
        
        // Writing to a file
        try {
            Files.write(Paths.get(filePath), contentToWrite.getBytes(StandardCharsets.UTF_8));
            System.out.println("File write successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading from a file
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            System.out.println("File contents:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
