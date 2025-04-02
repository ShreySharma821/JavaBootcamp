import java.util.Scanner;
public class SimpleIntrest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the principle");
		int principle = input.nextInt();
		
		System.out.printf("Enter the rate");
		int rate = input.nextInt();
		
		System.out.printf("Enter the time");
		int time = input.nextInt();
		
		int intrest= (principle*rate*time)/100;
		
		System.out.printf("The Simple Interest is %d for Principal %d, Rate of Interest %d and Time %d",intrest,principle,rate,time);
	
		input.close();
	}
	
}
