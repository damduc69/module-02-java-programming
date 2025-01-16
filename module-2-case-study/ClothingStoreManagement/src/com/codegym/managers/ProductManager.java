package com.codegym.managers;

import com.codegym.utils.FileUtil;
import com.codegym.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static ProductManager instance;
    private List<Product> products;
    private static final String PRODUCT_FILE_PATH = "F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\products.txt";

    public ProductManager() {
        products = FileUtil.readProductsFromFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\products.txt");
    }

    public static ProductManager getInstance() {
        if (instance == null) {
            instance = new ProductManager();
        }
        return instance;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewProducts();
                case 2 -> addProduct(scanner);
                case 3 -> updateProduct(scanner);
                case 4 -> deleteProduct(scanner);
                case 5 -> findProduct(scanner);
                case 6 -> running = false;
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void viewProducts() {
        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void addProduct(Scanner scanner) {
        System.out.print("Nhập ID sản phẩm: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        products.add(new Product(id, name, price));
        FileUtil.writeProductsToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\products.txt", products);
        System.out.println("Thêm sản phẩm thành công!");
    }

    private void updateProduct(Scanner scanner) {
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Product product : products) {
            if (product.getId() == id) {
                System.out.print("Nhập tên mới: ");
                product.setName(scanner.nextLine());
                System.out.print("Nhập giá mới: ");
                product.setPrice(scanner.nextDouble());
                FileUtil.writeProductsToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\products.txt", products);
                System.out.println("Cập nhật sản phẩm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm!");
    }

    private void deleteProduct(Scanner scanner) {
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = scanner.nextInt();

        products.removeIf(product -> product.getId() == id);
        FileUtil.writeProductsToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\products.txt", products);
        System.out.println("Xóa sản phẩm thành công!");
    }

    private void findProduct(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String keyword = scanner.nextLine();

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public void displayProductsFromFile() {
        List<Product> products = FileUtil.readProductsFromFile(PRODUCT_FILE_PATH);
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong hệ thống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : products) {
                System.out.println("ID: " + product.getId() + ", Tên: " + product.getName() + ", Giá: " + product.getPrice());
            }
        }
    }
}
