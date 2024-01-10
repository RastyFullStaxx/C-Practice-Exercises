import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        System.out.println("Intervals:");
        printIntervals(intervals);
        int[][] mergedIntervals = merge(intervals);
        System.out.println("Merged Intervals:");
        printIntervals(mergedIntervals);
    }

    public static int[][] merge(int[][] intervals) {
        // Implement a method to merge overlapping intervals
        return null;
    }

    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
