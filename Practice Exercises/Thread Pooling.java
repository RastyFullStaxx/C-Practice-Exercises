import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable task = () -> {
                System.out.println("Thread: " + Thread.currentThread().getName() + " is processing a task.");
            };
            executor.execute(task);
        }

        executor.shutdown();
    }
}
