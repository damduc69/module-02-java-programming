package Prime_Numbers_First;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choice function: ");
        System.out.println("1. Display first 20 prime numbers");
        System.out.println("2. Display prime numbers below 100");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayFirst20Primes();
                break;
            case 2:
                displayPrimeBelow100();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
    public static void displayFirst20Primes(){
        int count = 0;
        int num = 2;
        System.out.println("First 20 prime numbers: ");
        while(count < 20){
            if(isPrime(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

    }
    public static void displayPrimeBelow100(){
        System.out.println("Prime numbers below 100: ");
        for(int num = 2; num < 100; num++){
            if(isPrime(num)){
                System.out.print(num + " ");
            }

        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
