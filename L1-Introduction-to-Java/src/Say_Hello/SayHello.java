package Say_Hello;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Enter Name: ");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Hello " + name);
    }
}
