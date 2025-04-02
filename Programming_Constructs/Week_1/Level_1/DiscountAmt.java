import java.util.Scanner;
public class DiscountAmt{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
       // Declare a variables
        double fee,DiscountPercent;
         System.out.print("Enter the fee: ");
          fee = input.nextDouble();
         System.out.print("Enter Discountpercent: ");
        discountpercent=input.nextDouble();
        // Take user fee and discount percentage
 double Discount=((fee*DiscountPercent)/100);
		double Amt=fee-Discount;
		//print the output 
        System.out.println("The discount amount is INR  "+Discount+" and final discount fee "+ Amt);
// close the scanner
        input.close();
}
}
