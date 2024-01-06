public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        setZeroes(matrix);
        System.out.println("Matrix After Setting Zeroes:");
        printMatrix(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        // Implement a method to set all elements in the matrix to zero if the element is zero
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
