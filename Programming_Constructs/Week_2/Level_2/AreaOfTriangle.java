import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
	   
	   System.out.println("Enter height of triangle in cm");//prompting user to enter value of height
	   float height = scan.nextFloat();
	   
	   System.out.println("Enter base of triangle in cm");// prompting user to enter value of base 
	   float base =scan.nextFloat();
	   
	   float area= 0.5f*height*base;//calculating area in cm
	   
	   //printing the output
	   System.out.printf("Your area in cm is %.2f while in feet is %.2f while in inches is %.2f\n", area, area * 0.0328, area * 0.393);
		scan.close();
    }
}
