import java.util.Scanner;
public class CountDown2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter counter ");
int counter = input.nextInt();
for(int i=counter;i>=1;i--){
System.out.printf("%d\n",i);
}
}
}