import reactor.core.publisher.Flux;

public class ReactorExample {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.range(1, 5);
        numbers.subscribe(
            value -> System.out.println("Received: " + value),
            error -> System.err.println("Error: " + error),
            () -> System.out.println("Done!")
        );
    }
}
