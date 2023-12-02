import java.util.LinkedList;
import java.util.Queue;

class HitCounter {
    private Queue<Integer> hits;

    public HitCounter() {
        hits = new LinkedList<>();
    }

    public void hit(int timestamp) {
        hits.offer(timestamp);
    }

    public int getHits(int timestamp) {
        while (!hits.isEmpty() && timestamp - hits.peek() >= 300) {
            hits.poll();
        }
        return hits.size();
    }
}

public class DesignHitCounter {
    public static void main(String[] args) {
        HitCounter counter = new HitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        System.out.println("Hits at 4: " + counter.getHits(4));   // Output: 3
        counter.hit(300);
        System.out.println("Hits at 300: " + counter.getHits(300)); // Output: 4
        System.out.println("Hits at 301: " + counter.getHits(301)); // Output: 3
    }
}
