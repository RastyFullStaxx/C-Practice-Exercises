import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}
