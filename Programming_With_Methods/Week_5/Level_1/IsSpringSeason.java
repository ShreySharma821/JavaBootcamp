import java.util.Scanner;
public class IsSpringSeason{
	public static boolean IsSpring(int day, int month){
		if(month==4 || month==5 ){
			return true;
		}
		else if(month==3 && day>=20){
			return true;
		}
		else if (month==6 && day<=20){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the day: ");
		int day = input.nextInt();
		System.out.printf("Enter the month(1-12): ");
		int month = input.nextInt();
		boolean temp = IsSpringSeason.IsSpring(day,month);
		if (temp==true){
			System.out.printf("Spring Season");
		}
		else{
			System.out.printf("Not Spring Season");
		}
	}
}