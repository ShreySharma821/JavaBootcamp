import java.util.Scanner;
public class PurchasePrice {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the unit price: ");
        double unitPrice=input.nextDouble();
        System.out.print("Enter the quantity: ");
        double quantity=input.nextDouble();
      double purchaseprice= unitPrice*quantity;
      
        System.out.println("The total purchase price is INR " + purchaseprice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    input.close();
        }
}
