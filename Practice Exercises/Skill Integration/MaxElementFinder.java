public class MaxElementFinder {
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};
        System.out.println("Maximum element: " + findMax(array));
    }
}
