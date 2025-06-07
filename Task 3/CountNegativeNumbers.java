

public class CountNegativeNumbers {
    public static void main(String[] args) {
        int[][] matrix = {
            {-3, -2, -1, 1},
            {-2, 2, 3, 4},
            {4, 5, 7, 8}
        };
        System.out.println(countNegatives(matrix));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows - 1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                count += cols - col;
                row--;
            } else {
                col++;
            }
        }
        return count;
    }
}
