import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number1: ");
        double number1=input.nextDouble();
        System.out.print("Enter the number2: ");
        double number2=input.nextDouble();
        double quotient = 0, remainder = 0;
        if(number2!=0){
       quotient=number1/number2;
       remainder=number1%number2;
        System.out.println("The Quotient is "+quotient+" and the remainder is "+remainder+" of two number "+number1+" and "+number2);
             }
             else{
             System.out.print("Error");
      
        }
       
    input.close();
        }
}

