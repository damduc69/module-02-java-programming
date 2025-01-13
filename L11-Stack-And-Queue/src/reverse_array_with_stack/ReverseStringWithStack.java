package reverse_array_with_stack;

import java.util.Stack;

public class ReverseStringWithStack {
    public static String reverseString(String str) {
        Stack<String> stack = new Stack<>();

        String[] words = str.split(" ");
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reverseString = new StringBuilder();
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop()).append(" ");
        }

        return reverseString.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World This is Java Programming Language";
        System.out.println("Original String: " + input);


        System.out.println("=====T.T=====");

        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

    }
}
