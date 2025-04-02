import java.util.Scanner;
public class SumOfNumbers2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter number: ");
double num = input.nextDouble();
double sum=0;
while(num!=0){
if(num>0){
sum=sum+num;
System.out.print("Enter another number: ");
 num = input.nextDouble();
}
else {
break;
}
System.out.print(sum);
}
}
}