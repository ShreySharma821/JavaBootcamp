import java.util.Scanner;
public class DivisionProgram{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int quotient = number/divisor;
		int remainder = number%divisor;
		int[] arr = {quotient,remainder};
		return arr;
	}
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		System.out.printf("Enter 1st number: ");
		int number1= input.nextInt();
		System.out.printf("Enter 2nd number: ");
		int number2= input.nextInt();
		int[] finalarray = DivisionProgram.findRemainderAndQuotient(number1,number2);
		System.out.printf("The quotient is: %d\n",finalarray[0]);
		System.out.printf("The remainder is: %d",finalarray[1]);
	}
}