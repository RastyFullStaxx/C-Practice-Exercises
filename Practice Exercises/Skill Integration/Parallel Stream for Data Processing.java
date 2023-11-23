import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelStreamExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        AtomicInteger sum = new AtomicInteger(0);

        Arrays.stream(numbers)
                .parallel()
                .forEach(num -> sum.addAndGet(num));

        System.out.println("Sum of numbers using parallel stream: " + sum);
    }
}
