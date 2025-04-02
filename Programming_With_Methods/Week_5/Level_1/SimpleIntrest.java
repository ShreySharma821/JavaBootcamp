import java.util.Scanner;
public class SimpleIntrest{
	public static double IntrestCalculation(double principle,double rate , double time){
		double intrest = (principle*rate*time)/100;
		return intrest;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the principle: ");
		double principle = input.nextDouble();
		System.out.printf("Enter the time: ");
		double time = input.nextDouble();
		System.out.printf("Enter the rate: ");
		double rate = input.nextDouble();
		//SimpleIntrest intrest= new SimpleIntrest();
		double intrest = SimpleIntrest.IntrestCalculation(principle,rate,time);
		System.out.printf("The Simple Intrest is: %.2f",intrest);
	}
}	
