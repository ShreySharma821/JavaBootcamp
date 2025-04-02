import java.util.Scanner;
public class PowerOfANumber {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num=input.nextInt();
      System.out.print("Enter a power: ");
      int pow=input.nextInt();
      
      int result=1;
      for(int i=1;i<=pow;i++){
          result=result*num;
             }
      
       System.out.print(result);
 }
}

