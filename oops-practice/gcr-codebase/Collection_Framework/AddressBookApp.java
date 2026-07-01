import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;
    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name);
    }
    @Override
    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}
public class AddressBookApp {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private HashMap<String, Contact> map = new HashMap<>();
    private HashSet<String> phoneSet = new HashSet<>();
    public void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed!");
            return;
        }
        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name.toLowerCase(), c);
        phoneSet.add(phone);
        System.out.println("Contact added!");
    }
    public void searchContact(String name) {
        Contact c = map.get(name.toLowerCase());
        if (c != null) {
            System.out.println("Found: " + c);
        } else {
            System.out.println("Contact not found!");
        }
    }
    public void deleteContact(String name) {
        Contact c = map.remove(name.toLowerCase());
        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }
    public void displayContacts() {
        ArrayList<Contact> sorted = new ArrayList<>(contacts);
        Collections.sort(sorted);
        for (Contact c : sorted) {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        AddressBookApp app = new AddressBookApp();

        app.addContact("Devesh", "9999999999", "dev@example.com");
        app.addContact("Aman", "8888888888", "aman@example.com");
        app.addContact("Riya", "7777777777", "riya@example.com");

        app.displayContacts();

        app.searchContact("Aman");

        app.deleteContact("Aman");

        app.displayContacts();
    }
}