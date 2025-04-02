import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double[] salary = new double[10];
		double[] yearsOfService = new double[10];
		double[] newSalary = new double[10];
		double[] bonus = new double[10];
		for(int i=9;i>=0;i--){
			System.out.printf("Enter salary %d: ",10-i);
			salary[i]=input.nextDouble();
			if(salary[i]<0){
				System.out.printf("Invalid Entry\n");
				continue;
			}
		}
		for(int i=9;i>=0;i--){
			System.out.printf("Enter years of service of %d: ",10-i);
			yearsOfService[i]=input.nextDouble();
			if(yearsOfService[i]<0){
				System.out.printf("Invalid Entry\n");
				continue;
			}
		}
		for(int i=0;i<10;i++){
			if(yearsOfService[i]>5){
				bonus[i]=salary[i]*(0.05);
			}
			else{
				bonus[i]=salary[i]*(0.02);
			}
		}
		for(int i=0;i<10;i++){
			newSalary[i]=bonus[i]+salary[i];
		}
		double totalBonus=0;
		double totalOldSalary=0;
		double totalNewSalary=0;
		for(int i=0;i<10;i++){
			totalBonus=totalBonus+bonus[i];
			totalOldSalary=totalOldSalary+salary[i];
			totalNewSalary=totalNewSalary+newSalary[i];
		}
		
		System.out.printf("The total bonus payout is %.2f\n",totalBonus);
		System.out.printf("The total old salary is %.2f\n",totalOldSalary);
		System.out.printf("The total new salary is %.2f\n",totalNewSalary);
		System.out.printf("The new salary for all employees is: \n");
		for(int i=0;i<10;i++){
			System.out.printf("Salary of employee %d: %.2f\n",i+1,newSalary[i]);
		}
	}
}