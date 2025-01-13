package find_max_array;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] wealth = new double[20];
        int count;

        // Input the number of billionaires
        do {
            System.out.println("Enter the number of billionaires (maximum 20): ");
            count = scanner.nextInt();
            if (count > 20 || count <= 0) {
                System.out.println("Invalid number. Please enter a value between 1 and 20.");
            }
        } while (count > 20 || count <= 0);

        // Input the wealth of each billionaire
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter the wealth of billionaire #%d (in billions): ", i + 1);
            wealth[i] = scanner.nextDouble();
        }

        // Find the highest wealth and its position
        double maxWealth = wealth[0];
        int maxIndex = 0;

        for (int i = 1; i < count; i++) {
            if (wealth[i] > maxWealth) {
                maxWealth = wealth[i];
                maxIndex = i;
            }
        }

        // Display the result
        System.out.printf("The highest wealth is %.2f billion dollars, at position #%d in the list.\n",
                maxWealth, maxIndex + 1);

        scanner.close();
    }
}
