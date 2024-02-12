public class MinMaxFinder {
    public static void findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 7};
        findMinMax(array);
    }
}
