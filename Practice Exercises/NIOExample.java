import java.nio.file.*;

public class NIOExample {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("source.txt");
        Path target = Paths.get("target.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
