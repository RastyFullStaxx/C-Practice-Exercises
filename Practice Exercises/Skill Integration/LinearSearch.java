public class LinearSearch {
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 9, 7, 4, 6};
        int target = 7;
        System.out.println("Index of target: " + search(array, target));
    }
}
