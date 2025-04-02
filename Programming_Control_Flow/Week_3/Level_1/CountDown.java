import java.util.Scanner;
public class CountDownCountDown{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter counter ");
int counter = input.nextInt();
while(counter>=1){
System.out.printf("%d\n",counter);
counter--;
}
}
}