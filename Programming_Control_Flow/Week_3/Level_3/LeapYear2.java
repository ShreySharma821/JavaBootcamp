import java.util.Scanner;
public class LeapYear2{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
		
		
    System.out.printf("Enter to check if leap year: ");
	int year = input.nextInt();
	
	if (year>=1582){
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.printf("Leap Year");}
		else{
			System.out.printf("Not a Leap Year");}
	}
    input.close();
	}
}
