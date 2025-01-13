package find_max_element_matrix;

import java.util.Scanner;

public class FindMaxElementMatrix {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The maximum element in the matrix is: " + max);
    }
}
