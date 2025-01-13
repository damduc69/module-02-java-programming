package reverse_array_with_stack;

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
        reverseArray(array);

        System.out.println("\nReversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
