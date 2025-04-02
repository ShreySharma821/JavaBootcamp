import java.util.Scanner;
public class IsPrime{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
		
		
    System.out.printf("Enter to check if number is prime: ");
	int number=input.nextInt();
	boolean isPrime = false;
	int i=2;
	if(number>1){
		while(i<number){
			if(number%i==0){
				isPrime = false;
				break;
				}
			else{
				isPrime = true;
			}
			
			i++;
				
		}	
	}else{
		System.out.printf("1 is neither prime nor composite");
	}	

	System.out.print(isPrime);
    input.close();
	}
}