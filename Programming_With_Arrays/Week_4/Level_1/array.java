import java.util.Scanner;
public class array{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number of rows: ");
		int rows = input.nextInt();
		System.out.printf("Enter the number of columns: ");
		int columns = input.nextInt();
		int[][] arr2D = new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.printf("Enter element (%d,%d):",i+1,j+1);
				arr2D[i][j]=input.nextInt();
			}
		}
		int index=0;
		int[] array1D = new int[(rows*columns)];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array1D[index++]=arr2D[i][j];
			}
		}
		System.out.printf("The 1D array is: ");
		for(int i=0;i<index;i++){
			System.out.printf(" %d ",array1D[i]);
		}
	}
}