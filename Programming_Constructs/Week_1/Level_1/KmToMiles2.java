import java.util.Scanner;
public class KmToMiles2{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable 
        double km;

        // Prompt the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // Take user input for kilometers

        // Conversion formula: 1 mile = 1.6 kilometers
        double miles = km / 1.6;

        // print the output
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Close the Scanner object
        input.close();
    }
}
