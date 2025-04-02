import java.util.Scanner;
public class PoundsToKg{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the weight in pounds");
		double weightInPounds = input.nextDouble();
		
		double weightInkg=(weightInPounds)*2.2;
		
		System.out.printf("%.2f in pounds in %.2f in kg",weightInPounds,weightInkg);
	
		input.close();
	}
	
}
