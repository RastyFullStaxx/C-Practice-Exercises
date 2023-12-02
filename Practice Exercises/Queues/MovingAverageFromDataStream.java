import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    private Queue<Integer> queue;
    private int size;
    private double sum;

    public MovingAverage(int size) {
        this.queue = new LinkedList<>();
        this.size = size;
        this.sum = 0;
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }
}

public class MovingAverageFromDataStream {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println("Next 1: " + movingAverage.next(1));   // Output: 1.0
        System.out.println("Next 10: " + movingAverage.next(10)); // Output: 5.5
        System.out.println("Next 3: " + movingAverage.next(3));   // Output: 4.66667
        System.out.println("Next 5: " + movingAverage.next(5));   // Output: 6.0
    }
}
