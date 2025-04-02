import java.util.Scanner;
public class SumOfnNaturalNumbers2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
 if(num>=0){
int sum=num*(num+1)/2;
System.out.print("The sum of"+num+"natural numbers (from formula) is" +sum+ "\n");
}	
else{
System.out.print("The number"+num+" is not a natural number");
}
int sum=0;
int temp=num;
while(num>0){
sum=sum+num;
num--;
}
System.out.printf("The sum of %d natural numbers (using while loop) is %d\n",temp,sum);
}
}