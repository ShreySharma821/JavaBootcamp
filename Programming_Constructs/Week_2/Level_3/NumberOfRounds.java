
import java.util.Scanner;
public class NumberOfRounds {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter 1st side of triangle ");
int side1=input.nextInt();
System.out.printf("Enter 2nd side of triangle ");
int side2=input.nextInt();
System.out.printf("Enter 3rd side of triangle ");
int side3=input.nextInt();
int perimeter=side1+side2+side3;

System.out.printf(" The total number of rounds the athlete will run is %d to complete 5 km",5000/perimeter);

input.close();
}
}
