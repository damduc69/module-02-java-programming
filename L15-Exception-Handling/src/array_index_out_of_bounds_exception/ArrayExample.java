package array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Array length: " + array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        try {
            System.out.println( "Element at index " + index + " is "+ array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }

    }
}
