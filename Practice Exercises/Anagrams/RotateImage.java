public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotateImage(matrix);
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }

    public static void rotateImage(int[][] matrix) {
        // Implement a method to rotate the given NxN matrix (image) by 90 degrees clockwise
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
