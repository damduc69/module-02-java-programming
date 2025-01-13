package binary_search;

import java.util.Arrays;

public class BinarySearch {

    static int binarySearch(int[] list, int x){
        int left = 0;
        int right = list.length -1;
        while (left <= right){
            int mid = (left + right)/2;
            if(list[mid] == x)
                return mid;

            if(list[mid] < x)
                 left = mid + 1;
            else
                 right = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {36, 63, 65, 86, 79, 13, 75, 50, 49, 19};
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int x = 63;
        int result = binarySearch(array, x);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element " + x + " found at " + "index " + result);
    }
}
