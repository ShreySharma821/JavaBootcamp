import java.util.Scanner;
public class OperationsOnDouble {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	   System.out.printf("Enter 1st number");
	   double a = scan.nextDouble();
	   
	    System.out.printf("Enter 2nd number");
	   double b = scan.nextDouble();
	   
	   
	    System.out.printf("Enter 3rd number");
	   double c = scan.nextDouble();
	   
	   System.out.printf("The results of Int Operations are %f , %f , %f , and %f", a + b *c, a * b + c, c + a / b, a % b + c);
		scan.close();
    }	
}
