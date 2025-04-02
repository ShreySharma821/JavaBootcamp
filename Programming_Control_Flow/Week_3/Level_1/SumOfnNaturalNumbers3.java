import java.util.Scanner;
public class SumOfnNaturalNumbers3 {
public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int num=input.nextInt();
 int sum=0;
 if(num<=0){
 System.out.print("Not a Natural number");
 }
 else {
 for(int i=1; i<=num; i++){
 sum=sum+i;
 }
 System.out.print("The sum is: "+sum);
 }
 }
}