package remove_element;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to remove: ");
        int remove = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != remove) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
