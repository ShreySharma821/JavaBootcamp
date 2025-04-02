import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	  System.out.printf("Enter 1st number");
	   int number1 = scan.nextInt();
	   
	   System.out.printf("Enter 2nd number");
	   int number2 = scan.nextInt();
	   
	   int temp;
	   temp=number1;
	   number1=number2;
	   number2=temp;
	   
	   System.out.printf(" The swapped numbers are %d and %d",number1,number2);

		scan.close();
    }
	
}
