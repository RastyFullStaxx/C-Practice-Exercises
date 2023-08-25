import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.forEach(n -> System.out.print(n + " "));
        System.out
