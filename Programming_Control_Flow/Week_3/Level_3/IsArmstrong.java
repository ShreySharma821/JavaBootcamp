import java.util.Scanner;
public class IsArmstrong{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.printf("Enter number to check if armstrong or not: ");
	int number=input.nextInt();

	int sum=0;
	int originalNumber=number;
	while(number!=0){
		int temp=number%10;
		sum=sum+(temp*temp*temp);
		number=number/10;
	}
	if(sum==originalNumber){
		System.out.printf("%d is an Armstrong Number",originalNumber);
	}
	else{
		System.out.printf("%d is not an Armstrong Number",originalNumber);}
	 
	}
}
