package example;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {36, 63, 65, 86, 79, 13, 75, 50, 49, 19};
        selectionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
