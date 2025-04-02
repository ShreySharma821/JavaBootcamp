import java.util.Scanner;
public class BonusOfEmployees {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a Salary: ");
       double salary=input.nextDouble();
       System.out.print("Enter year of service: ");
       double year=input.nextDouble();
       if(year<5){
           System.out.print("No bonus");
       }
       else {
           double bonus=(salary*0.05)+salary;
           System.out.print("The bonus given is: "+bonus);
       }
       
      }
    }
