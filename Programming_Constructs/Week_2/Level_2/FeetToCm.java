import java.util.Scanner;
public class FeetToCm {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distfeet=input.nextDouble();
        double distcm = distfeet*30.48;
        double distinches = distcm*2.54;
        
        
        
        System.out.println("The distance in cm is "+distcm+" while in feet is "+distfeet+" and inches is "+distinches);

        input.close();
        }
}
