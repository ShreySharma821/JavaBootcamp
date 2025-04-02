import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.printf("Enter 1st number: ");
	double number1=input.nextDouble();
	System.out.printf("Enter 2nd number: ");
	double number2=input.nextDouble();
	System.out.printf("Enter an operator from '+' , '-' , '*' , '/' : ");
	String op=input.next();
	switch(op){
		case "+":
			System.out.printf("%.2f + %.2f = %.2f",number1,number2,number1+number2);
			break;
		case "-":
			System.out.printf("%.2f - %.2f = %.2f",number1,number2,number1-number2);
			break;
		case "*":
			System.out.printf("%.2f * %.2f = %.2f",number1,number2,number1*number2);
			break;
		case "/":
			System.out.printf("%.2f / %.2f = %.2f",number1,number2,number1/number2);
			break;
		default:
			System.out.printf("Please enter a valid operator");
			break;
	}
	}
} 