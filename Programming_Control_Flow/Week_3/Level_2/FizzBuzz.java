import java.util.Scanner;
public class FizzBuzz {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a Number: ");
       int num=input.nextInt();
       if(num>0){
           for(int i=0;i<=num;i++){
               if(i%3==0)
               System.out.print("FIZZ\n");
               else if(i%5==0)
               System.out.print("Buzz\n");
               else if(i%3==0 && i%5==0)
               System.out.print("FIZZBUZZ\n");
                else{
                    System.out.print(i+"\n");
                }
           }
          
       }
       else {
           System.out.print("Number not positive");
       }
        }
    }
