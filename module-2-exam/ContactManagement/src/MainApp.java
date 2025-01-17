import contact.Contact;
import handler.CSVFileHandler;
import handler.Validator;
import management.ContactManager;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = ContactManager.getInstance();

        CSVFileHandler.readFromFile("F:\\CODEGYM\\MODULE 2\\module-2-exam\\ContactManagement\\src\\data\\contacts.csv", contactManager);

        while (true) {
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (contactManager.getContacts().isEmpty()) {
                        System.out.println("Danh bạ rỗng.");
                    } else {
                        contactManager.getContacts().forEach(contact -> System.out.println(contact));
                    }
                    break;
                case 2:
                    System.out.print("Nhập họ tên: ");
                    String name = scanner.nextLine();
                    if (!Validator.isValidName(name)) {
                        System.out.println("Họ tên không hợp lệ.");
                        break;
                    }

                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    if (!Validator.isValidPhoneNumber(phone)) {
                        System.out.println("Số điện thoại không hợp lệ.");
                        break;
                    }

                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    if (address.isEmpty()) {
                        System.out.println("Địa chỉ không được để trống.");
                        break;
                    }

                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    if (!Validator.isValidEmail(email)) {
                        System.out.println("Email không hợp lệ.");
                        break;
                    }

                    System.out.print("Nhập Facebook: ");
                    String facebook = scanner.nextLine();
                    if (!Validator.isValidFacebookURL(facebook)) {
                        System.out.println("Facebook không hợp lệ.");
                        break;
                    }

                    contactManager.addContact(new Contact(name, phone, address, email, facebook));
                    break;
                case 3:
                    System.out.print("Nhập chỉ số liên hệ cần cập nhật: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Cập nhật thành công. ");
                    break;
                case 4:
                    System.out.print("Nhập chỉ số liên hệ cần xóa: ");
                    int deleteIndex = scanner.nextInt();
                    contactManager.deleteContact(deleteIndex);
                    System.out.println("Xóa thành công.");
                    break;
                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    Contact foundContact = contactManager.searchContact(searchName);
                    if (foundContact != null) {
                        System.out.println(foundContact);
                    } else {
                        System.out.println("Không tìm thấy.");
                    }
                    break;
                case 6:
                    CSVFileHandler.readFromFile("F:\\CODEGYM\\MODULE 2\\module-2-exam\\ContactManagement\\src\\data\\contacts.csv", contactManager);
                    break;
                case 7:
                    CSVFileHandler.writeToFile("F:\\CODEGYM\\MODULE 2\\module-2-exam\\ContactManagement\\src\\data\\contacts.csv", contactManager.getContacts());
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
