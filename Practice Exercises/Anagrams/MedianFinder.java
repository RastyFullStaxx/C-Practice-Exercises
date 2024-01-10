import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
        // Implement a method to add a number to the data stream and return the median
    }

    public double findMedian() {
        // Implement a method to find the median of the data stream
        return 0.0;
    }
}
