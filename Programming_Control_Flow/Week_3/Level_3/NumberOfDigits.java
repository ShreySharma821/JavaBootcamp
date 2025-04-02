import java.util.Scanner;
public class NumberOfDigits{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.printf("Enter number: ");
	int number=input.nextInt();

	int count=0;
	int originalNumber=number;
	while(number!=0){
		count=count+1;
		number=number/10;
	}
	System.out.printf("The number of digits in %d are %d",originalNumber,count);
	 
	}
}