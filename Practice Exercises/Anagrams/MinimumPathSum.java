public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println("Grid:");
        printGrid(grid);
        int minPathSum = minPathSum(grid);
        System.out.println("Minimum Path Sum: " + minPathSum);
    }

    public static int minPathSum(int[][] grid) {
        // Implement a method to find the minimum path sum from the top-left corner to the bottom-right corner of the grid
        return 0;
    }

    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
}
