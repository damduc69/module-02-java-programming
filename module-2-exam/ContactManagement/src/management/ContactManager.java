package management;

import contact.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private static ContactManager instance;
    private List<Contact> contacts;

    // Singleton pattern để đảm bảo chỉ có một instance
    private ContactManager() {
        contacts = new ArrayList<>();
    }

    public static ContactManager getInstance() {
        if (instance == null) {
            instance = new ContactManager();
        }
        return instance;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, Contact contact) {
        if (index >= 0 && index < contacts.size()) {
            contacts.set(index, contact);
        } else {
            System.out.println("Chỉ số không hợp lệ.");
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
        } else {
            System.out.println("Chỉ số không hợp lệ.");
        }
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
