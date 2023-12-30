import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("k: " + k);
        System.out.println("x: " + x);
        List<Integer> kClosestElements = findClosestElements(arr, k, x);
        System.out.println("K Closest Elements: " + kClosestElements);
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Implement a method to find the k closest elements to the given integer x in the array
        return null;
    }
}
