import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = scanner.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        
        if (index == 0) {
            System.out.printf("No digits to process.\n");
        } else {
            int largest = 0, secondLargest = 0;
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }
            
            System.out.printf("Largest digit: %d\n", largest);
            System.out.printf("Second largest digit: %d\n", secondLargest);
        }
        
        scanner.close();
    }
}
