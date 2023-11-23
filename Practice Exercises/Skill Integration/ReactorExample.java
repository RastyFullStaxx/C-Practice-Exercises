import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactorExample {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.just(1, 2, 3, 4, 5);

        numbers
            .map(n -> n * 2)
            .filter(n -> n > 5)
            .subscribe(System.out::println);

        Mono<String> message = Mono.just("Hello, Reactor!");
        message.subscribe(System.out::println);
    }
}
