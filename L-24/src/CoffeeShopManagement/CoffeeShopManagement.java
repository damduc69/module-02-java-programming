package CoffeeShopManagement;

import java.util.*;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class Customer extends User {
    List<String> purchaseHistory;

    Customer(String username, String password) {
        super(username, password);
        this.purchaseHistory = new ArrayList<>();
    }
}

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class CoffeeShopManagement {
    private static final Map<String, User> staffAccounts = new HashMap<>();
    private static final Map<String, Customer> customers = new HashMap<>();
    private static final List<Item> menu = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        staffAccounts.put("owner", new User("owner", "ownerpass"));
        staffAccounts.put("staff", new User("staff", "staffpass"));

        menu.add(new Item("Espresso", 3.0));
        menu.add(new Item("Latte", 4.5));
        menu.add(new Item("Cappuccino", 4.0));
        menu.add(new Item("Mocha", 4.5));
        menu.add(new Item("Americano", 3.5));
        menu.add(new Item("Green Tea Latte", 4.0));
        menu.add(new Item("Hot Chocolate", 3.5));

        int choice;

        do {
            System.out.println("Welcome to Coffee Shop Management");
            System.out.println("1. Login as Owner/Staff");
            System.out.println("2. Register/Login as Customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    staffLogin();
                    break;
                case 2:
                    customerMenu();
                    break;
                case 3:
                    System.out.println("Thank you for using Coffee Shop Management!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }

    private static void staffLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = staffAccounts.get(username);
        if (user != null && user.password.equals(password)) {
            System.out.println("Login successful!");
            staffMenu();
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    private static void staffMenu() {
        int choice;

        do {
            System.out.println("Staff Menu");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item");
            System.out.println("4. Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        menu.add(new Item(name, price));
        System.out.println("Item added successfully!");
    }

    private static void removeItem() {
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine();

        menu.removeIf(item -> item.name.equals(name));
        System.out.println("Item removed successfully (if it existed)!");
    }

    private static void updateItem() {
        System.out.print("Enter item name to update: ");
        String name = scanner.nextLine();

        for (Item item : menu) {
            if (item.name.equals(name)) {
                System.out.print("Enter new price: ");
                item.price = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Item updated successfully!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void customerMenu() {
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                registerCustomer();
                break;
            case 2:
                customerLogin();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void registerCustomer() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (customers.containsKey(username)) {
            System.out.println("Username already exists.");
        } else {
            customers.put(username, new Customer(username, password));
            System.out.println("Registration successful!");
        }
    }

    private static void customerLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Customer customer = customers.get(username);
        if (customer != null && customer.password.equals(password)) {
            System.out.println("Login successful!");
            customerActions(customer);
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    private static void customerActions(Customer customer) {
        int choice;

        do {
            System.out.println("Customer Menu");
            System.out.println("1. View Menu");
            System.out.println("2. Buy Item");
            System.out.println("3. View Purchase History");
            System.out.println("4. Calculate Total");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewMenu();
                    break;
                case 2:
                    buyItem(customer);
                    break;
                case 3:
                    viewPurchaseHistory(customer);
                    break;
                case 4:
                    calculateTotal(customer);
                    break;
                case 5:
                    System.out.println("Logging out.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }


    private static void viewMenu() {
        System.out.println("Menu:");
        for (Item item : menu) {
            System.out.println(item.name + " - $" + item.price);
        }
    }

    private static void buyItem(Customer customer) {
        System.out.print("Enter item name to buy: ");
        String name = scanner.nextLine();

        for (Item item : menu) {
            if (item.name.equals(name)) {
                customer.purchaseHistory.add(name);
                System.out.println("Purchase successful!");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void viewPurchaseHistory(Customer customer) {
        System.out.println("Purchase History:");
        for (String item : customer.purchaseHistory) {
            System.out.println(item);
        }
    }

    private static void calculateTotal(Customer customer) {
        double total = 0;
        for (String itemName : customer.purchaseHistory) {
            for (Item item : menu) {
                if (item.name.equals(itemName)) {
                    total += item.price;
                    break;
                }
            }
        }
        System.out.println("Total amount spent: $" + total);
    }

}
