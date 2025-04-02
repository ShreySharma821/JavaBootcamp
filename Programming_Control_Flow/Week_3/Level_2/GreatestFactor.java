import java.util.Scanner;
public class GreatestFactor {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num=input.nextInt();
      int greatestFactor=1;
      for(int i=num-1;i>=1;i--){
          if(num%i==0){
              greatestFactor = i; 
                break;
             
          }
      }
       System.out.print(greatestFactor+"\n");
 }
}
