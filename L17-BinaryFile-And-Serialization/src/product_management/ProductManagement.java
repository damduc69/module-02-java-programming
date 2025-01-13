package product_management;

import java.io.*;
import java.util.Scanner;

import static read_and_write_to_file.Main.writeDataToFile;

public class ProductManagement {
    private static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nProduct Management System");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Search product by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.print("Enter product ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, manufacturer, description);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(product.toFileString());
            writer.newLine();
            System.out.println("Product added successfully.");
        } catch (IOException e) {
            System.out.println("Error saving product: " + e.getMessage());
        }
    }

    private static void displayProducts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Product product = Product.fromFileString(line);
                System.out.println(product);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No products found. Add some products first.");
        } catch (IOException e) {
            System.out.println("Error reading products: " + e.getMessage());
        }
    }

    private static void searchProduct(Scanner scanner) {
        System.out.print("Enter product ID to search: ");
        String id = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                Product product = Product.fromFileString(line);
                if (product.getId().equals(id)) {
                    System.out.println(product);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No products found. Add some products first.");
        } catch (IOException e) {
            System.out.println("Error reading products: " + e.getMessage());
        }
    }
}
