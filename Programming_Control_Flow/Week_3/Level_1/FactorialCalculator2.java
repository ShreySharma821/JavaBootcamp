import java.util.Scanner;
public class FactorialCalculator2 {
public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int num=input.nextInt();
 int fact=1;
 if(num<=0){
 System.out.print("Not a Natural number");
 }
 else {
 for(int i=1; i<=num; i++){
 fact=fact*i;
 }
 System.out.print("The factorial is: "+fact);
 }
 }
}