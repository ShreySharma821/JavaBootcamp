import java.util.Scanner;
public class TrigonometryFunctions{
	public static double[] calculateTrigonometricFunctions(double angle){
		double sinofangle=Math.sin(angle);
		double cosofangle=Math.cos(angle);
		double tanofangle=Math.tan(angle);
		double[] arr ={sinofangle,cosofangle,tanofangle};
		return arr;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter angle in degrees: ");
		double angleindegrees = input.nextDouble();
		double angleinradian = (angleindegrees*3.14)/180;
		double[] finalarr = TrigonometryFunctions.calculateTrigonometricFunctions(angleinradian);
		System.out.printf("The sine of the angle given is: %.2f\n",finalarr[0]);
		System.out.printf("The cosine of the angle given is: %.2f\n",finalarr[1]);
		System.out.printf("The tan of the angle given is: %.2f",finalarr[2]);
	}
		
		
	
}