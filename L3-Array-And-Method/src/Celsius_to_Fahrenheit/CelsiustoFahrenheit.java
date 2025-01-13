package Celsius_to_Fahrenheit;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the temperature in Celsius: ");
                    celsius = sc.nextDouble();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
                    break;
                case 2:
                    System.out.println("Enter the temperature in Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
