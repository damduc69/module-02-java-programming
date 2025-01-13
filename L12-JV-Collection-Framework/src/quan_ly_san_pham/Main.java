package quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------QUAN LY SAN PHAM------\n" +
                    "1. Add product\n" +
                    "2. Update product\n" +
                    "3. Delete product\n" +
                    "4. Display product\n" +
                    "5. Search product by name\n" +
                    "6. Sort product by ascending\n" +
                    "7. Sort product by descending\n" +
                    "8. Exit\n");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String name = scanner.next();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    ProductManager.addProduct(new Product(id, name, price));             }
                case 2 -> {
                    System.out.println("Enter product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String name = scanner.next();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    ProductManager.updateProduct(id, name, price);
                }
                case 3 -> {
                    System.out.println("Enter product id: ");
                    int id = scanner.nextInt();
                    ProductManager.deleteProduct(id);
                }
                case 4 -> ProductManager.displayProduct();
                case 5 -> {
                    System.out.println("Enter product name: ");
                    String name = scanner.next();
                    ProductManager.searchProductByName(name);
                }
                case 6 -> productManager.sortProductByAscending();
                case 7 -> productManager.sortProductByDescending();
                case 8 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

}
