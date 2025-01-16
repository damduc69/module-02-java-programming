package com.codegym.managers;

import com.codegym.utils.FileUtil;

import java.util.Map;
import java.util.Scanner;

public class AuthManager {
    private static AuthManager instance;
    private Map<String, String> accounts;

    private AuthManager() {
        accounts = FileUtil.readAccountsFromFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\accounts.txt");
    }

    public static AuthManager getInstance() {
        if (instance == null) {
            instance = new AuthManager();
        }
        return instance;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===== QUẢN LÝ TÀI KHOẢN =====");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký tài khoản mới");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> login(scanner);
                case 2 -> register(scanner);
                case 3 -> running = false;
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void login(Scanner scanner) {
        System.out.print("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();

        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Sai tên đăng nhập hoặc mật khẩu!");
        }
    }

    private void register(Scanner scanner) {
        System.out.print("Nhập tên đăng nhập mới: ");
        String username = scanner.nextLine();

        if (accounts.containsKey(username)) {
            System.out.println("Tên đăng nhập đã tồn tại!");
            return;
        }

        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();

        accounts.put(username, password);
        FileUtil.writeAccountsToFile("F:\\CODEGYM\\MODULE 2\\module-2-case-study\\ClothingStoreManagement\\src\\com\\codegym\\data\\accounts.txt", accounts);
        System.out.println("Đăng ký thành công!");
    }
}
