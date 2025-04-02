import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] math = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter marks for Student %d\n", i + 1);
            
            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextInt();
            } while (physics[i] < 0);

            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();
            } while (chemistry[i] < 0);

            do {
                System.out.print("Math: ");
                math[i] = sc.nextInt();
            } while (math[i] < 0);

            percentage[i] = (physics[i] + chemistry[i] + math[i]) / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.printf("\n%s %s %s %s %s %s\n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d %d %.2f %c\n", i + 1, physics[i], chemistry[i], math[i], percentage[i], grade[i]);
        }
        
        sc.close();
    }
}