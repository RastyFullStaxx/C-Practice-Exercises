public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};
        int missing = findMissingNumber(nums, 6);

        System.out.println("Missing number in the array: " + missing);
    }

    public static int findMissingNumber(int[] nums, int n) {
        int total = n * (n + 1) / 2;
        for (int num : nums) {
            total -= num;
        }
        return total;
    }
}
