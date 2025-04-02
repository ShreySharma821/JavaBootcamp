import java.util.Scanner;
public class TotalRounds{
	public static double Rounds(double side1,double side2,double side3){
		double perimeter = (side1+side2+side3)*0.001;
		double totalrounds = 5/perimeter;
		return totalrounds;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter 1st side(in meters): ");
		double side1 = input.nextDouble();
		System.out.printf("Enter 2nd side(in meters): ");
		double side2 = input.nextDouble();
		System.out.printf("Enter 3rd side(in meters): ");
		double side3 = input.nextDouble();
		double totalround = TotalRounds.Rounds(side1,side2,side3);
		System.out.printf("The total number of rounds you must run are: %.2f",totalround);
	}
}