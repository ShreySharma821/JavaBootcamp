import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of persons: ");
        int n = scanner.nextInt();
        
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        
        for (int i = 0; i < n; i++) {
            do {
                System.out.printf("Enter height (in meters) for person %d: ", i + 1);
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);
            
            do {
                System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);
            
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9)
                weightStatus[i] = "Normal weight";
            else if (personData[i][2] < 29.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        
        System.out.printf("%s %s %s %s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f %.2f %.2f %s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        scanner.close();
    }
}
