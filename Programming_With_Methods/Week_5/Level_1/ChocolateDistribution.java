import java.util.Scanner;
public class ChocolateDistribution{
	public static int[] findDistributedAndRemainingChocolates(int numberofchildren, int numberofchocolates){
		int distributedchocolates = numberofchocolates/numberofchildren;
		int remainingchocolates = numberofchocolates%numberofchildren;
		int[] arr = {distributedchocolates,remainingchocolates};
		return arr;
	}
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		System.out.printf("Enter number of chocolates: ");
		int numberofchocolates= input.nextInt();
		System.out.printf("Enter number of children: ");
		int numberofchildren= input.nextInt();
		int[] finalarray = ChocolateDistribution.findDistributedAndRemainingChocolates(numberofchildren,numberofchocolates);
		System.out.printf("The number of chocolates each child gets is: %d\n",finalarray[0]);
		System.out.printf("The left over chocolates are: %d",finalarray[1]);
	}
}