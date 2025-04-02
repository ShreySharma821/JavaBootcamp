public class ProfitPercentage {
    public static void main(String[] args) {
        // Define costprice and sellingprice
        float costprice=129;
		float sellingprice=191;
     //calculating profit in number
        float Profit=sellingprice-costprice;
		//calculating profit in percentage
		float ProfitPrecentage=(Profit/costprice)*100;
        //print the output 
        System.out.println("The Cost price is INR " + costprice + "and Selling Price is INR " + sellingprice);
	System.out.println("The Profit is INR " + Profit + "and the ProfitPrecentage is" + ProfitPrecentage);
    }
}

