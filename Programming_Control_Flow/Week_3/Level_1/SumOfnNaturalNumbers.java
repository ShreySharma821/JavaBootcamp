import java.util.Scanner;
public class SumOfnNaturalNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		if(num>0){
			int sum=num*(num+1)/2;
			System.out.print("The sum of"+num+"natural numbers is"+sum);
		}
		else{
			System.out.print("The number"+num+" is not a natural number");
		}
	}
}