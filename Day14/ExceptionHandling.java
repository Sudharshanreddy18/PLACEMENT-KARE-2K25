public class ExceptionHandling {
    public static void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static void main(String[] args) {
        divide(10, 2); // Valid division
        divide(10, 0); // Division by zero
    }
    }

