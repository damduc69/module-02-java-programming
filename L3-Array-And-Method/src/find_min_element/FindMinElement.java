package find_min_element;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int[] arr ;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
    }
}
