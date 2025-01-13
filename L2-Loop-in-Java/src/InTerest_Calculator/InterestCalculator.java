package InTerest_Calculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        double money = 1.0;
        int month = 1;
        double interest = 1.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter money want to deposit: ");
        money = sc.nextDouble();
        System.out.println("Enter month: ");
        month = sc.nextInt();
        System.out.println("Enter interest: ");
        interest = sc.nextDouble();

        double total = 0;
        for(int i = 0; i < month; i++){
            total += money * (interest / 100) / 12 * month;
        }

        System.out.println("Total: " + total);
    }
}
