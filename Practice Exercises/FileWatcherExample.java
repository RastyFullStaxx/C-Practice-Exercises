import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class FileWatcherExample {
    public static void main(String[] args) throws Exception {
        Path directory = Paths.get("/path/to/directory");
        WatchService watchService = FileSystems.getDefault().newWatchService();

        directory.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

        while (true) {
            WatchKey key = watchService.poll(1, TimeUnit.SECONDS);

            if (key != null) {
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println("File modified: " + event.context());
                }
                key.reset();
            }
        }
    }
}
