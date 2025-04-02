import java.util.Scanner;
public class BasicCalculator2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	   System.out.printf("Enter 1st number");
	   int a = scan.nextInt();
	   
	    System.out.printf("Enter 2nd number");
	   int b = scan.nextInt();
	   
	   
	    System.out.printf("Enter 3rd number");
	   int c = scan.nextInt();
	   
	   System.out.printf("The results of Int Operations are %d , %d , %d , and %d", a + b *c, a * b + c, c + a / b, a % b + c);

	  
		scan.close();
    }
	
}
