public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 2};
        int[] minMax = findMinMax(arr);

        System.out.println("Minimum element: " + minMax[0]);
        System.out.println("Maximum element: " + minMax[1]);
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int[] minMax = {min, max};
        return minMax;
    }
}
