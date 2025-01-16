package com.codegym.managers;

import com.codegym.models.Customer;
import com.codegym.utils.FileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    private static CustomerManager instance;
    private List<Customer> customers;
    private static final String CUSTOMER_FILE_PATH = "F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\customers.txt";

    public CustomerManager() {
        customers = FileUtil.readCustomersFromFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\customers.txt");
    }

    public static CustomerManager getInstance() {
        if (instance == null) {
            instance = new CustomerManager();
        }
        return instance;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== QUẢN LÝ KHÁCH HÀNG =====");
            System.out.println("1. Xem danh sách khách hàng");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Cập nhật thông tin khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Tìm kiếm khách hàng");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewCustomers();
                case 2 -> addCustomer(scanner);
                case 3 -> updateCustomer(scanner);
                case 4 -> deleteCustomer(scanner);
                case 5 -> findCustomer(scanner);
                case 6 -> running = false;
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void viewCustomers() {
        System.out.println("===== DANH SÁCH KHÁCH HÀNG =====");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private void addCustomer(Scanner scanner) {
        System.out.print("Nhập ID khách hàng: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email khách hàng: ");
        String email = scanner.nextLine();

        customers.add(new Customer(id, name, email));
        FileUtil.writeCustomersToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\customers.txt", customers);
        System.out.println("Thêm khách hàng thành công!");
    }

    private void updateCustomer(Scanner scanner) {
        System.out.print("Nhập ID khách hàng cần cập nhật: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.print("Nhập tên mới: ");
                customer.setName(scanner.nextLine());
                System.out.print("Nhập email mới: ");
                customer.setEmail(scanner.nextLine());
                FileUtil.writeCustomersToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\customers.txt", customers);
                System.out.println("Cập nhật khách hàng thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng!");
    }

    private void deleteCustomer(Scanner scanner) {
        System.out.print("Nhập ID khách hàng cần xóa: ");
        int id = scanner.nextInt();

        customers.removeIf(customer -> customer.getId() == id);
        FileUtil.writeCustomersToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\customers.txt", customers);
        System.out.println("Xóa khách hàng thành công!");
    }

    private void findCustomer(Scanner scanner) {
        System.out.print("Nhập tên khách hàng cần tìm: ");
        String keyword = scanner.nextLine();

        for (Customer customer : customers) {
            if (customer.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(customer);
            }
        }
    }

    public void displayCustomersFromFile() {
        List<Customer> customers = FileUtil.readCustomersFromFile(CUSTOMER_FILE_PATH);
        if (customers.isEmpty()) {
            System.out.println("Không có khách hàng nào trong hệ thống.");
        } else {
            System.out.println("Danh sách khách hàng:");
            for (Customer customer : customers) {
                System.out.println("ID: " + customer.getId() + ", Tên: " + customer.getName() + ", Email: " + customer.getEmail());
            }
        }
    }
}
