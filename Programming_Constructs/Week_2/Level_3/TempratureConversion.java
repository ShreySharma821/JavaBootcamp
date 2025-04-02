import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   System.out.printf("Enter tempcelcius: ");
	   double celcius = input.nextDouble();
	   double fahrenheitResult = (celcius * 9/5) + 32;
	   
	  System.out.printf("The " + celcius + " celsius is "+ fahrenheitResult+" fahrenheit");
      input.close();
    }
}
