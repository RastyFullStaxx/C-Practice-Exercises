import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int length = findLongestSubarrayLength(arr, k);

        System.out.println("Length of the longest subarray with sum " + k + ": " + length);
    }

    public static int findLongestSubarrayLength(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = i + 1;
            }

            if (!prefixSum.containsKey(currentSum)) {
                prefixSum.put(currentSum, i);
            }

            if (prefixSum.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSum.get(currentSum - k));
            }
        }

        return maxLength;
    }
}
