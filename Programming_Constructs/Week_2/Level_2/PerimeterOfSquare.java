import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side=input.nextDouble();
        double perimeter=side*side;
        
        
        System.out.println("The length of the side is " + side +" whose perimeter is "+ perimeter);

        input.close();
        }
}
