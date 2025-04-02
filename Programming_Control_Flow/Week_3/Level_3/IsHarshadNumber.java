import java.util.Scanner;
public class IsHarshadNumber{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.printf("Enter number to check if harshad number or not: ");
	int number=input.nextInt();

	int sum=0;
	int originalNumber=number;
	while(number!=0){
		int temp=number%10;
		sum=sum+temp;
		number=number/10;
	}
	if(originalNumber%sum==0){
		System.out.printf("%d is a Harshad Number",originalNumber);}
	else{
		System.out.printf("%d is not a Harshad Number",originalNumber);}
	}
}
