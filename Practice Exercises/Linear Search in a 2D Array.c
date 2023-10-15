public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        boolean found = linearSearch2D(matrix, target);

        System.out.println("Is " + target + " found in the 2D array? " + found);
    }

    public static boolean linearSearch2D(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int value : row) {
                if (value == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
