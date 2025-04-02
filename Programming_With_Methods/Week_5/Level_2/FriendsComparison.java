import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter age of %s: ", names[i]);
            ages[i] = sc.nextInt();
            System.out.printf("Enter height of %s (in cm): ", names[i]);
            heights[i] = sc.nextDouble();
        }

        System.out.printf("Youngest: %s\n", findYoungest(names, ages));
        System.out.printf("Tallest: %s\n", findTallest(names, heights));

        sc.close();
    }

    public static String findYoungest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    public static String findTallest(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }
}
