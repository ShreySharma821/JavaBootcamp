import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter marks for Student %d\n", i + 1);
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Math";
                do {
                    System.out.printf("%s: ", subject);
                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.printf("\n%s %s %s %s %s %s\n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d %d %.2f %-10c\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
        
        sc.close();
    }
}
