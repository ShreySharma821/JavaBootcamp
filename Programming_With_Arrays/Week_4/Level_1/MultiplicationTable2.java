import java.util.Scanner;

public class MultiplicationTable2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a number between 6 and 9: ");
		int number = input.nextInt();
		
		int[] multiplicationResult = new int[10];
		for (int i=0;i<10;i++){
			multiplicationResult[i]=number*(i+1);
		}
		for (int j=0;j<10;j++){
			System.out.printf("%d * %d= %d\n",number,(j+1),multiplicationResult[j]);
		}
		input.close();
	}	
}