package com.codegym.utils;

import com.codegym.models.Customer;
import com.codegym.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtil {
    public static List<Customer> readCustomersFromFile(String filePath) {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String email = parts[2];
                    Customer customer = new Customer(id, name, email);
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file khách hàng: " + e.getMessage());
            e.printStackTrace();
        }
        return customers;
    }

    public static void writeCustomersToFile(String filePath, List<Customer> customers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Customer customer : customers) {
                writer.write(customer.getId() + "," + customer.getName() + "," + customer.getEmail());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file khách hàng: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static List<Product> readProductsFromFile(String filePath) {
        List<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    products.add(new Product(id, name, price));
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file sản phẩm: " + e.getMessage());
        }
        return products;
    }

    public static void writeProductsToFile(String filePath, List<Product> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Product product : products) {
                writer.write(product.getId() + "," + product.getName() + "," + product.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file sản phẩm: " + e.getMessage());
        }
    }

    public static Map<String, String> readAccountsFromFile(String filePath) {
        Map<String, String> accounts = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    accounts.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file tài khoản: " + e.getMessage());
        }
        return accounts;
    }

    public static void writeAccountsToFile(String filePath, Map<String, String> accounts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : accounts.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file tài khoản: " + e.getMessage());
        }
    }
}
