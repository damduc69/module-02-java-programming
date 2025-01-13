package example;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {36, 63, 65, 86, 79, 13, 75, 50, 49, 19};
        insertionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
        }
    }

