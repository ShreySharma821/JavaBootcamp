import java.util.Scanner;
public class FizzBuzz2{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
		
		
    System.out.print("Enter a number");
	int num = input.nextInt();
	int i=1;
	while(i<num){
		if(i%3==0 && i%5==0){
			System.out.printf("FizzBuzz\n");
		}else if(i%5==0){
			System.out.printf("Buzz\n");
		}else if(i%3==0){
			System.out.printf("Fizz\n");
		}else{
			System.out.printf("%d\n",i);
		}
		i++;
	}
	}
}
