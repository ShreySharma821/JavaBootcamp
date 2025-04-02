import java.util.Scanner;
public class BMICalculator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.printf("Enter weight in kg: ");
	double weight=input.nextDouble();
	System.out.printf("Enter height in cm: ");
	double height=input.nextDouble();
	height=height/100;
	double BMI= weight/(height*height);
	if(BMI<=18.4){
		System.out.printf("Your BMI is %.2f\nStatus: Underweight",BMI);}
	else if(BMI<=24.9 && BMI>=18.5){
		System.out.printf("Your BMI is %.2f\nStatus: Normal",BMI);}
	else if(BMI<=39.9 && BMI>=25.0){
		System.out.printf("Your BMI is %.2f\nStatus: Overweight",BMI);}
	else{
		System.out.printf("Your BMI is %.2f\nStatus: Obese",BMI);
	}
	}
}
