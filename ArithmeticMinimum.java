import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of a: ");
            int a = scanner.nextInt();

            System.out.print("Enter the value of b: ");
            int b = scanner.nextInt();

            int multiplyResult = a * b;
            int divideResult = a / b;
            int addResult = a + b;
            int subtractResult = a - b;

            int min = Math.min(Math.min(multiplyResult, divideResult), Math.min(addResult, subtractResult));

            System.out.println("Minimum value: " + min);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input");
        }

        scanner.close();
    }
}
