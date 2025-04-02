import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	   
	   System.out.println("Enter first number");//prompting user to enter 1st number
	   float number1 = scan.nextFloat();
	   
	   System.out.println("Enter second number");//prompting user to enter 2nd number
	   float number2 =scan.nextFloat();
	   
	   float addition= number1+number2;//performing all calculations
	   float multiplication = number1*number2;
	   float substraction = number1-number2;
	   float division= number1/number2;
	   //printing the output
	   System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers " + number1 +" and "+ number2+ " is " + addition +substraction+multiplication+division);
	   scan.close();
    }
}