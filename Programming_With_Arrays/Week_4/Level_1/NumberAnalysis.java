import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; 

       
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

       
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first > last) {
            System.out.println("The first number (" + first + ") is greater than the last number (" + last + ").");
        } else if (first < last) {
            System.out.println("The first number (" + first + ") is less than the last number (" + last + ").");
        } else {
            System.out.println("The first number (" + first + ") is equal to the last number (" + last + ").");
        }

        scanner.close();
    }
}
