import java.util.Scanner;
public class YoungestAndShortest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] height= new double[3];
		double[] age = new double[3];
		for(int i=0;i<3;i++){
			System.out.printf("Enter height %d: ",i+1);
			height[i]=input.nextDouble();	
		}
		for(int i=0;i<3;i++){
			System.out.printf("Enter age %d: ",i+1);
			age[i]=input.nextDouble();	
		}
		double minage=age[0] ;
		for(int i=0;i<3;i++){
			if(age[i]<minage){
				minage=age[i];
			}
		}
		double minheight=height[0];
		for(int i=0;i<3;i++){
			if(height[i]<minheight){
				minheight=height[i];
			}
		}
		System.out.printf("The youngest of the three friends is %.1f old\n",minage);
		System.out.printf("The shortest of the three friends has height %.2f",minheight);
	}
	
}