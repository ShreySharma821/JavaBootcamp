import java.util.Scanner;
public class MultipleOfNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	  System.out.printf("Enter a number: ");
	  int num = input.nextInt();
	  for(int i=100;i>0;i--){
		 if(num%i==0){
			 System.out.print("\n"+i);
		 }
else{
			continue;
		 }
	 }

}
}
