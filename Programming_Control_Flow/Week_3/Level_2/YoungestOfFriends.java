import java.util.Scanner;
public class YoungestOfFriends {
 public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      System.out.print("Age of Amar: ");
      int age1=input.nextInt();
      System.out.print("Amar Height: ");
      int height1=input.nextInt();
      System.out.print("Age of Akbar: ");
      int age2=input.nextInt();
      System.out.print("Akbar Height: ");
      int height2=input.nextInt();
      System.out.print("Anthony age: ");
       int age3=input.nextInt();
      System.out.print("Anthony Height: ");
      int height3=input.nextInt();
      
      if(age2>age1 && age3>age1){
          System.out.print("The smallest one is: "+age1);
      }
        else if (age1>age2 && age3>age2){
            System.out.print("The smallest one is: "+age2);
            } 
            else {
                System.out.print("The smallest one is: "+age3);
            }
          
           if(height2>height1 && height3>height1){
          System.out.print("\nThe smallest one is: "+height1);
           }
        else if (height1>height2 && height3>height2){
            System.out.print("\nThe smallest one is: "+height2);
            }  
            else {
                System.out.print("\nThe smallest one is: "+height3);
            }
           
 }
}
