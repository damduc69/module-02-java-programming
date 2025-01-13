package number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Toan tu +: " + a);
            System.out.println("Toan tu -: " + b);
            System.out.println("Toan tu *: " + c);
            System.out.println("Toan tu /: " + d);
        } catch (ArithmeticException e) {
            System.err.println("Khong the chia cho 0");
        }
    }
}
