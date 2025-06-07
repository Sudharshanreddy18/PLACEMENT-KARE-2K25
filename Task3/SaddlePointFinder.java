public class SaddlePointFinder {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        findSaddlePoint(matrix);
    }

    public static void findSaddlePoint(int[][] matrix) {
        boolean saddlePointExists = false;
        for (int i = 0; i < matrix.length; i++) {
            int minRow = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean isSaddlePoint = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > minRow) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle point found: " + minRow);
                saddlePointExists = true;
            }
        }

        if (!saddlePointExists) {
            System.out.println("No saddle point exists.");
        }
    }
}
