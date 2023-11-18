public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        double median = findMedianOfTwoSortedArrays(arr1, arr2);

        System.out.println("Median of the two sorted arrays: " + median);
    }

    public static double findMedianOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        if (m > n) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
            int tempLength = m;
            m = n;
            n = tempLength;
        }

        int low = 0;
        int high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : arr1[partitionX - 1];
            int minX = (partitionX == m) ? Integer.MAX_VALUE : arr1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : arr2[partitionY - 1];
            int minY = (partitionY == n) ? Integer.MAX_VALUE : arr2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
