package fit_array;

import java.util.Scanner;

public class Fit_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter elements of array 2: ");
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }
        System.out.println("Merged array: ");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(arr3[i] + " ");
        }



    }
}
