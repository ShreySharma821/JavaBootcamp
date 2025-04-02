import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.printf("Invalid input. Please enter a positive integer.\n");
        } else {
            int factorial = 1, i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.printf("Factorial of %d is %d\n", num, factorial);
        }
        scanner.close();
    }
}