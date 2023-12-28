public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        System.out.println("Array nums: " + Arrays.toString(nums));
        System.out.println("k: " + k);
        int countSubarrays = numSubarrayProductLessThanK(nums, k);
        System.out.println("Count of Subarrays with Product Less Than K: " + countSubarrays);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        // Implement a method to count the number of subarrays with a product less than k
        return 0;
    }
}
