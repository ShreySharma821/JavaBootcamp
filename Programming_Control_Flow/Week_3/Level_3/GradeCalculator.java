import java.util.Scanner;
public class GradeCalculator{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
		
		
    System.out.printf("Enter marks in Maths: ");
	double Maths = input.nextDouble();
	System.out.printf("Enter marks in Physics: ");
	double Physics = input.nextDouble();
	System.out.printf("Enter marks in Chemistry: ");
	double Chemistry = input.nextDouble();
	
	double percent=(Maths+Physics+Chemistry)/3;
	
	System.out.printf("Your Average Marks are %.2f\n",percent);
	if(percent>=80){
		System.out.printf("Your grade is A\nRemarks:Level 4, above agency-normalized standards.");}
	else if(percent<=79 && percent>=70){
		System.out.printf("Your grade is B\nRemarks:Level 3, at agency-normalized standards.");}
	else if(percent<=69 && percent>=60){
		System.out.printf("Your grade is C\nRemarks: Level 2, below, but appraoching agency-normalized standards.");}
	else if(percent<=59 && percent>=50){
		System.out.printf("Your grade is D\nRemarks: Level 1,well below agency-normalized standards.");}
	else if(percent<=49 && percent>=40){
		System.out.printf("Your grade is E\nRemarks: Level 1-, too below agency-normalized standards.");}
	else{
		System.out.printf("Your grade is R\nRemarks: Remedial Standards");}
	
    input.close();
	}
}