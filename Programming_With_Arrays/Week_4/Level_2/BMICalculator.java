import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of persons: ");
        int n = scanner.nextInt();
        
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter height (in meters) for person %d: ", i + 1);
            height[i] = scanner.nextDouble();
            System.out.printf("Enter weight (in kg) for person %d: ", i + 1);
            weight[i] = scanner.nextDouble();
            
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 24.9)
                status[i] = "Normal weight";
            else if (bmi[i] < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        
        System.out.printf("%s %s %s %s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f %.2f %.2f %s\n", height[i], weight[i], bmi[i], status[i]);
        }
        
        scanner.close();
    }
}
