package sum_number_column;

import java.util.Scanner;

public class SumNumberColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the column number to sum: ");
        int column = sc.nextInt();

        if (column < 0 || column >= cols) {
            System.out.println("Invalid column number.");
        } else {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][column];
            }
            System.out.println("Sum of column " + column + ": " + sum);
        }
    }
}
