public class Pens {
    public static void main(String[] args) {
       // Define totsl number of pens
        int TotalPens=14;
     //find the left over pens
        int NonDistributedPens = TotalPens%3;
        //find the distribiuted pens
        int DistributedPens = TotalPens/3;
		
		//print the output 
        System.out.println("The pen per student is "+DistributedPens+" and the remaining pens not distruibuted is "+ NonDistributedPens);
    }
}
