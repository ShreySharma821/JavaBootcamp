import java.util.Scanner;
public class WhichIsLargest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number1: ");
int num1 = input.nextInt();
System.out.print("Enter a number2: ");
int num2 = input.nextInt();
System.out.print("Enter a number3: ");
int num3 = input.nextInt();

 if(num1>num2 && num1>num3){
System.out.println("Is the first number the largest? YES\n");
System.out.println("Is the second number the largest? NO\n");
System.out.println("Is the third number the largest? NO\n");
}
else if(num2>num1 && num2>num3){
System.out.println("Is the first number the largest? No");
System.out.println("Is the first number the largest? YES");
System.out.println("Is the third number the largest? No");
}
else {
System.out.println("Is the first number the largest? NO");
System.out.println("Is the first number the largest? NO");
System.out.println("Is the third number the largest? YES");
}
}
}
