 public class Fee {
    public static void main(String[] args) {
       // Deine variable for totalfee
        float TotalFee=125000;
     //define discount percentage
        float DiscountPercentage=10;
        //define discount 
        float Discount=TotalFee*(DiscountPercentage/100);
      float AmtToPay=TotalFee-Discount;
    //print the output 
        System.out.println("The discount amount is INR  "+Discount+" and final discount fee "+ AmtToPay);
    }
}
