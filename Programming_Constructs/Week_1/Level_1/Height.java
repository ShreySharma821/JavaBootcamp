import java.util.Scanner;
public class Height{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
       // Declare a variable
        double heightINcm;
         System.out.print("Enter height: ");
         heightINcm=input.nextDouble();
        //convert height in inches
 double heightininches=heightINcm/2.54;
 double heightinfeet=heightINinches/12;
	
		//print the output 
        System.out.println("Your Height in cm is " + heightincm + "  while in feet is " + heightinfeet + " and inches is"+ heightininches);
        input.close();
}
}
