import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5)
                .thenApplyAsync(result -> result * 2);

        future.thenAccept(result -> System.out.println("Result: " + result));
    }
}
