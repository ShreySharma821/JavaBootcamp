import java.util.Scanner;
public class EvenOddArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a natural number: ");
		int number = input.nextInt();
		int[] oddArray = new int[(number/2)+1];
		int[] evenArray = new int[(number/2)+1];
		if (number>0){
			int evenIndex=0;
			int oddIndex=0;
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0){
					evenArray[evenIndex++] = i; // Save even number
				} else {
					oddArray[oddIndex++] = i; // Save odd number
				}
			}
			System.out.printf("The even array is: ");
			for(int i=0;i<evenIndex;i++){
				System.out.printf(" %d ",evenArray[i]);
			}
			System.out.printf("\nThe odd array is: ");
			for(int i=0;i<oddIndex;i++){
				System.out.printf(" %d ",oddArray[i]);
			}
		}else{
			System.out.printf("ERROR...");
		}
	}  
}       