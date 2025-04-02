import java.util.Scanner;
public class  factorArrays{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.printf("Enter a number: ");
		int number = input.nextInt();
		int[] factorArray = new int[number] ;
		int index=0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				factorArray[index++]=i;
			}
		}
		System.out.printf("The factor array is: ");
		for(int i =0; i<index;i++){
			System.out.printf(" %d ", factorArray[i]);
		}
	}
}