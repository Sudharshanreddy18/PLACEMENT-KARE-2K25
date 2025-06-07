public class MaxSumSubmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2, -1},
            {-3, 4, 6},
            {2, -1, -3}
        };
        System.out.println(maxSumSubmatrix(matrix));
    }

    public static int maxSumSubmatrix(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];
            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }
        return maxSum;
    }

    private static int kadane(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int num : arr) {
            maxEndingHere += num;
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
