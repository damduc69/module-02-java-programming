package add_element;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to add: ");
        int add = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != add) {
                arr[count] = arr[i];
                count++;
            }
        }
        arr[count] = add;
        System.out.println("New array: ");
        for (int i = 0; i <= count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
