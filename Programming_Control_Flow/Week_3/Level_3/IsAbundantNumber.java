import java.util.Scanner;
public class IsAbundantNumber{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	System.out.printf("Enter number to check if adundant number or not: ");
	int number=input.nextInt();

	int i=1;
	int sum=0;
	while(i<number){
		if(number%i==0){
			sum=sum+i;}
		i++;
		
	}
	if (sum>number){
		System.out.printf("%d is an Adundant Number",number);}
	}
} 
