import java.util.Scanner;
public class LargestAndSmallest{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int[] finalarr = {number1,number2,number3};
		int largest=finalarr[0],smallest=finalarr[0];
		for (int i=0;i<3;i++){
			if(finalarr[i]>largest){
				largest =finalarr[i];
			}
		}	
		for (int i=0;i<3;i++){
			if(finalarr[i]<smallest){
				smallest=finalarr[i];
			}
		}	
		int[] arr1={largest, smallest};
		return arr1;
	}
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		System.out.printf("Enter 1st number: ");
		int number1= input.nextInt();
		System.out.printf("Enter 2nd number: ");
		int number2= input.nextInt();
		System.out.printf("Enter 3rd number: ");
		int number3= input.nextInt();
		int[] finalarray = LargestAndSmallest.findSmallestAndLargest(number1,number2,number3);
		System.out.printf("The largest of given 3 numbers is %d\n",finalarray[0]);
		System.out.printf("The smallest of given 3 numbers is %d\n",finalarray[1]);
		input.close();
	}
}