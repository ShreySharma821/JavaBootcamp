import java.util.Scanner;
public class OddEvenNumbers {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a Number: ");
       int num=input.nextInt();
       if(num<=0){
           System.out.print("Not a Natural number");
       }
      for(int i=0;i<=num;i++){
          if(i%2==0){
              System.out.print("Even Number\n");
           }
          else {
              System.out.print("Odd Number\n");
          }
    }
}
}
