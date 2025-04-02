import java.util.Scanner;
public class TotalNumberOfHandshakes{
	public static int TotalHandshakes(int number){
		int total = (number * (number - 1)) / 2;
		return total;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number of people: ");
		int number = input.nextInt();
		int totalhandshakes = TotalNumberOfHandshakes.TotalHandshakes(number);
		System.out.printf("The total number of handshakes are: %d",totalhandshakes);
	}
}