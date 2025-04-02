import java.util.Scanner;
public class DivisibiltyBy5{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
System.out.println("Is the number "+num+ "divisible by 5?" );
if(num%5==0){
System.out.print("Yes");
}
else{
System.out.print("No");
}
input.close();
}
}
`