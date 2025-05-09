import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number, count = 0;
        
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        System.out.printf("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d", digits[i]);
        }
        System.out.println();
        
        scanner.close();
    }
}
