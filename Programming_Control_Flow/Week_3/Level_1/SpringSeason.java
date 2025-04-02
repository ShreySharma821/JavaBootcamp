import java.util.Scanner;
public class SpringSeason{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter month(1-12): ");
int month = input.nextInt();
System.out.print("Enter day(1-31): ");
int day = input.nextInt();
 if(month==4 || month==5 ){
System.out.print("Spring Season");
}
else if(month==3 && day>=20){
System.out.print("Spring Season");
}
else if (month==6 && day<=20){
System.out.print("Spring Season");
}
else{
System.out.print("Not a Spring Season");
}
}
}