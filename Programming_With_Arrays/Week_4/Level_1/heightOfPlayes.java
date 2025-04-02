import java.util.Scanner;

public class heightOfPlayes{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double[] heightOf11 = new double[11];
	for(int i=0;i<11;i++){
		System.out.printf("Enter height(in foot) %d: ",i+1);
		heightOf11[i]=input.nextDouble();
	}
	
	double sum=0;
	for(int i=0;i<11;i++){
		sum=sum+heightOf11[i];
	}
	double mean=sum/11;
	System.out.printf("The mean height of the football team is %.2f",mean); 	
	}
}