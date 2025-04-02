import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	   System.out.printf("Enter salary: ");
	   double salary = input.nextDouble();
	    System.out.printf("Enter bonus: ");
	   double bonus = input.nextDouble();
	   double TotalIncome = salary+bonus;
	   
	   System.out.printf("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+TotalIncome);
             input.close();
    }
}
