import java.util.Scanner;
public class NumberAnalysis{
	public static int Analysis(int number){
		if (number>0){
			return 1;
		}
		else if (number ==0){
			return 0;
		}
		else{
			return -1;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int number = input.nextInt();
		int ans = NumberAnalysis.Analysis(number);
		System.out.printf("%d",ans);
	}
}
