import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};

        setZeroes(matrix);

        System.out.println("Matrix with Zeroes Set: " + Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int row : zeroRows) {
            Arrays.fill(matrix[row], 0);
        }

        for (int col : zeroCols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
