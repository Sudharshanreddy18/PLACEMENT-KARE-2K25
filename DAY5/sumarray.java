public class sumarray {

    public static void main(String[] args) {
        int[][] arr = 
        {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19}
        };
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }    
    }
    
}
