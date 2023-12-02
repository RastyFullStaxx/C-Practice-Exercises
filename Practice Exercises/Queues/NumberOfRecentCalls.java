import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        System.out.println("Ping 1: " + counter.ping(1));      // Output: 1
        System.out.println("Ping 100: " + counter.ping(100));  // Output: 2
        System.out.println("Ping 3001: " + counter.ping(3001));// Output: 3
        System.out.println("Ping 3002: " + counter.ping(3002));// Output: 3
    }
}
