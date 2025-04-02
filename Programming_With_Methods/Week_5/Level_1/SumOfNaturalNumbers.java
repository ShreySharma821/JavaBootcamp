import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static int Sum(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			sum = sum+i;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner input  = new Scanner(System.in);
		System.out.printf("Enter a number: ");
		int number= input.nextInt();
		int sum = SumOfNaturalNumbers.Sum(number);
		System.out.printf("The sum of %d natural numbers is: %d",number,sum);
	}
}
	