import java.util.Arrays;

public class MaxMinArrayElements {
    public static void findMaxMin(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println("Max Element: " + max);
        System.out.println("Min Element: " + min);
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 15, 20, 8};
        System.out.println("Array: " + Arrays.toString(array));
        findMaxMin(array);
    }
}
