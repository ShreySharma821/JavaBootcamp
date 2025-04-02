import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	  
	   int tempInCelsius;
	    System.out.printf("Enter Temprature in Fahrenheit");
	   int tempInFahrenheit = scan.nextInt();
	   
	   tempInCelsius=(tempInFahrenheit-32)*5/9;
	    
	   
	   System.out.printf(" The %d fahrenheit is %d celsius",tempInFahrenheit,tempInCelsius);

	   
	  
		scan.close();
    }
	
}
