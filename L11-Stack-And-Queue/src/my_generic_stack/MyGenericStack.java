package my_generic_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop element from stack: " + stack.pop());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after pop operations: " + stack.size());
    }

}
