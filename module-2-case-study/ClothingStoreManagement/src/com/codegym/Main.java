package com.codegym;

import com.codegym.managers.AuthManager;
import com.codegym.managers.CustomerManager;
import com.codegym.managers.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        ProductManager productManager = new ProductManager();
        boolean running = true;

        while (running) {
            System.out.println("===== HỆ THỐNG QUẢN LÝ CỬA HÀNG =====");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Đăng ký/Đăng nhập");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> CustomerManager.getInstance().menu();
                case 2 -> ProductManager.getInstance().menu();
                case 3 -> AuthManager.getInstance().menu();
                case 4 -> {
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    running = false;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
