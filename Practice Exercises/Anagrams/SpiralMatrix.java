import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        List<Integer> spiralOrder = spiralOrder(matrix);
        System.out.println("Spiral Order: " + spiralOrder);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        // Implement a method to return all elements of the matrix in spiral order
        return null;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
