import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.print("Queue Contents: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
