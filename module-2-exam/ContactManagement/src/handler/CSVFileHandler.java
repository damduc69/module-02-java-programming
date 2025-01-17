package handler;

import contact.Contact;
import management.ContactManager;

import java.io.*;
import java.util.List;

public class CSVFileHandler {

    public static void readFromFile(String filename, ContactManager contactManager) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 5) {
                    Contact contact = new Contact(values[0], values[1], values[2], values[3], values[4]);
                    contactManager.addContact(contact);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public static void writeToFile(String filename, List<Contact> contacts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Contact contact : contacts) {
                bw.write(contact.getName() + "," + contact.getPhone() + "," + contact.getAddress() + ","
                        + contact.getEmail() + "," + contact.getFacebook());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
