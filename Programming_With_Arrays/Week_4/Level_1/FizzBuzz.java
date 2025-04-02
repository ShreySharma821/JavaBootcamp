import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

            String[] arr = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i] = "Buzz";
            } else {
                arr[i] = String.valueOf(i);
            }
        }

        System.out.println("The position of elements in the array is as follows:");
        for (int i = 0; i <= number; i++) {
            System.out.printf("Position %d = %s\n", i, arr[i]);
        }

        input.close();
    }
}
