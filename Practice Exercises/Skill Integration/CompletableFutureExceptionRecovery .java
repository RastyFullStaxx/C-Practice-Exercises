import java.util.concurrent.CompletableFuture;

public class CompletableFutureExceptionRecovery {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> 10 / 0)
                .exceptionally(ex -> {
                    System.err.println("Exception: " + ex);
                    return 0;
                });

        int result = future.join();
        System.out.println("Result: " + result);
    }
}
