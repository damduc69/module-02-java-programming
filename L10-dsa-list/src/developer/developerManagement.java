package developer;

import java.util.ArrayList;
import java.util.Scanner;

public class developerManagement {
    private static ArrayList<Developer> developers = new ArrayList<>();

    public static void main(String[] args) {

        developers.add(new Developer(1L, "John", 25, "Backend", 5000.0));
        developers.add(new Developer(2L, "Jane", 30, "Frontend", 6000.0));
        developers.add(new Developer(3L, "Bob", 35, "Fullstack", 7000.0));
        developers.add(new Developer(4L, "Alice", 40, "Manager", 8000.0));

        displayDevelopers();
        addDeveloper(new Scanner(System.in));
        updateDeveloper(new Scanner(System.in));
        deleteDeveloper(new Scanner(System.in));
        searchDeveloperByName(new Scanner(System.in));

    }


    private static void displayDevelopers() {
        System.out.println("List of developers: ");
        for (Developer developer : developers) {
            System.out.println(developer);
        }
    }

    private static void addDeveloper(Scanner scanner) {
        System.out.println("==========ENTER INFORMATION FOR NEW DEVELOPER==========");
        System.out.println("Enter developer id: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter developer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter developer age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter developer position: ");
        String position = scanner.nextLine();

        System.out.print("Enter developer salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        developers.add(new Developer(id, name, age, position, salary));

        System.out.println("Developer added successfully.");
        displayDevelopers();
    }

    public static void updateDeveloper(Scanner scanner) {
        System.out.println("==========ENTER INFORMATION FOR UPDATE DEVELOPER========== ");
        System.out.println("Enter developer id : ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter developer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter developer age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter developer position: ");
        String position = scanner.nextLine();
        System.out.println("Enter developer salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        for (Developer developer : developers) {
            if (developer.getId() == id) {
                developer.setName(name);
                developer.setAge(age);
                developer.setPosition(position);
                developer.setSalary(salary);
                System.out.println("DEVELOPER UPDATED SUCCESSFULLY.");
                System.out.println(developer);
                return;
            }
        }
        System.out.println("DEVELOPER NOT FOUND.");
    }

    public static void deleteDeveloper(Scanner scanner) {
        System.out.println("==========DELETE DEVELOPER==========");
        System.out.println("Enter developer id need delete: ");
        long id = scanner.nextLong();

        for (Developer developer : developers) {
            if (developer.getId() == id) {
                developers.remove(developer);
                System.out.println("DEVELOPER DELETED SUCCESSFULLY.");
                displayDevelopers();
                return;
            }
        }
        System.out.println("DEVELOPER NOT FOUND.");
    }
    private static void searchDeveloperByName(Scanner scanner) {
        System.out.println("==========SEARCH DEVELOPER BY NAME==========");
        System.out.println("Enter developer name need search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Developer developer : developers) {
            if (developer.getName().equalsIgnoreCase(name)) {
                System.out.println(developer);
                found = true;
            }
        }
        if (!found) {
            System.out.println("DEVELOPER NOT FOUND.");
        }
    }


}
