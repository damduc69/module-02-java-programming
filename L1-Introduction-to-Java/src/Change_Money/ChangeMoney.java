package Change_Money;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000, usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter money USD: ");
        usd = sc.nextDouble();
        double change = usd * 23000;
        System.out.printf("Value VND: " + change);
    }
}
