import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            System.out.println(current);

            String next1 = current + "0";
            String next2 = current + "1";

            queue.offer(next1);
            queue.offer(next2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Binary Numbers from 1 to " + n + ":");
        generateBinaryNumbers(n);
    }
}
