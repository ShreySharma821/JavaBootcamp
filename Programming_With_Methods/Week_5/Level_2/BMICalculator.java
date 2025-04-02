import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            data[i][0] = sc.nextDouble();
            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getBMIStatus(data[i][2]);
        }

        System.out.printf("\n %s %s %s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f %.2f %.2f %s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }

    public static double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }
}
