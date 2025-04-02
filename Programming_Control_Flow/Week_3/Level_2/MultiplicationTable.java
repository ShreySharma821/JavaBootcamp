import java.util.Scanner;
public class MultiplicationTable {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a Number: ");
       int num=input.nextInt();
       if(num>=6 && num<=9){
           System.out.print("The Multiplication Table is: \n");
           for(int i=1;i<=10;i++)
               
              System.out.print(num+"*"+i+"="+num*i+"\n");
           
       }
       else{
           System.out.print("Number out of range");
       }
        }
    }
