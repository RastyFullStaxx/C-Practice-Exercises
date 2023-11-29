import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayEqualZerosOnes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 0, 0};

        int maxLength = findMaxLength(nums);

        System.out.println("Length of the longest subarray with equal zeros and ones: " + maxLength);
    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1);

        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;

            if (sumIndexMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }

        return maxLength;
    }
}
