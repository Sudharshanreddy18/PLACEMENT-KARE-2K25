

public class PowerCalculator {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println("Result: " + power(x, y));
    }

    public static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
