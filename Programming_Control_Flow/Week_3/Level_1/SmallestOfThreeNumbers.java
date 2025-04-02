import java.util.Scanner;
public class SmallestOfThreeNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number1: ");
int num1 = input.nextInt();
System.out.print("Enter a number2: ");
int num2 = input.nextInt();
System.out.print("Enter a number3: ");
int num3 = input.nextInt();
System.out.println("Is the first number the smallest?");
if(num2>num1 && num3>num1){
System.out.println("YES");
}
else{
System.out.println("No");
}
}
}
