import java.util.Scanner;
public class TotalDistanceAndTime{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Create a variable name to indicate the person traveling
      System.out.printf("Enter the name: ");
	  String name = input.next();
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
      System.out.printf("Enter the city from which joureny started: ");
	  String fromCity = input.next();
	  System.out.printf("Enter the city via which the journey took place: ");
	  String viaCity = input.next();
	  System.out.printf("Enter the city where journey ended: ");
	  String toCity = input.next();

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      System.out.printf("Enter the distance between %s and %s: ",fromCity,viaCity);
	  double distanceFromToVia = input.nextDouble();

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      System.out.printf("Enter the time taken from %s to %s: ",fromCity,viaCity);
	  int timeFromToVia = input.nextInt();

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      System.out.printf("Enter the distance between %s and %s: ",viaCity,toCity);
	  double distanceViaToFinalCity = input.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      System.out.printf("Enter the time taken from %s to %s: ",viaCity,toCity);
	  int timeViaToFinalCity = input.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " hours");
 

	
		input.close();
	}
	
}
