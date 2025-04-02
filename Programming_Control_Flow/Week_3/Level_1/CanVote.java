import java.util.Scanner;
public class CanVote{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter age: ");
int age = input.nextInt();
 if(age>18){
System.out.print("The person's age is"+age+" and can vote");
}
else{
System.out.print("The person's age is"+age+" and cannot vote");
}
}
}
