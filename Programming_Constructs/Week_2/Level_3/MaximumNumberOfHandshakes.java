import java.util.Scanner;
public class MaximumNumberOfHandshakes{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the number of students");
		int noOfStudents = input.nextInt();
		
		int noOfHandshakes=(noOfStudents * (noOfStudents - 1)) / 2;
		
		System.out.printf("The number of possible handshakes between %d students is %d",noOfStudents,noOfHandshakes);
	
		input.close();
	}
	
}
