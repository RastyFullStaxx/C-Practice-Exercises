import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 7;

        int subarrayCount = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum equal to " + k + ": " + subarrayCount);
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (sumCountMap.containsKey(sum - k)) {
                count += sumCountMap.get(sum - k);
            }

            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
