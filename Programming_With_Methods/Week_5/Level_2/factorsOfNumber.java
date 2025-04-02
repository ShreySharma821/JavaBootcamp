import java.util.Scanner;
public class factorsOfNumber{
	public static int[] findfactors(int number){
		int count=0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				count+=1;
			}	
		}
		int index=0;
		int[] factorarray= new int[count];
		for(int j=1;j<=number;j++){
			if(number%j==0){
				factorarray[index]=j;
				index++;
			}	
		}
		return factorarray;
		
	}
	public static int sumOfFactors(int[] array,int index){
		int sum =0;
		for(int i=0;i<index;i++){
			sum=sum+array[i];
		}
		return sum;
	}
	public static double sumOfSquaresOfFactors(int[] array,int index){
		double sum =0;
		for(int i=0;i<index;i++){
			double temp = Math.pow(array[i],2);
			sum=sum+temp;
		}
		return sum;
	}
	public static int ProductOfFactors(int[] array,int index){
		int product =1;
		for(int i=0;i<index;i++){
			product = product*array[i]; 
		}
		return product;
	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int number = input.nextInt();
		int[] finalarray = factorsOfNumber.findfactors(number);
		System.out.printf("The factor array is: ");
		int count=0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				count+=1;
			}	
		}
		for(int j=0;j<count;j++){
			System.out.printf("%d ",finalarray[j]);
		}
		System.out.printf("\n");
		int sumoffactors= factorsOfNumber.sumOfFactors(finalarray,count);
		double sumofsquaresoffactors= factorsOfNumber.sumOfSquaresOfFactors(finalarray,count);
		int productoffactors= factorsOfNumber.ProductOfFactors(finalarray,count);
		System.out.printf("The sum of factors is: %d\n",sumoffactors);
		System.out.printf("The sum squares of factors is: %.2f\n",sumofsquaresoffactors);
		System.out.printf("The product of factors is: %d\n",productoffactors);
	input.close();
	}
}
