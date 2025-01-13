package example;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {36, 63, 65, 86, 79, 13, 75, 50, 49, 19};
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j] < array[j - 1]) {

                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
