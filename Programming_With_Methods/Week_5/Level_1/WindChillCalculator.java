import java.util.Scanner;
public class WindChillCalculator{
	public static double calculateWindChill(double temprature, double windSpeed){
		double windChill = 35.74 + 0.6215 *temprature + (0.4275*temprature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter temprature: ");
		double temp = input.nextDouble();
		System.out.printf("Enter windspeed: ");
		double windspeed = input.nextDouble();
		double windchill = WindChillCalculator.calculateWindChill(temp,windspeed);
		System.out.printf("The windchill is : %.2f",windchill);
	}
		
		
	
}