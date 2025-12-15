import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    // ------ UC2 - Ability to add a new Contact to Address Book -------
    public void addContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added");

    }

    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available.");
        } else {
            for (Contact i : contacts) {
                System.out.println(i);
            }
        }
    }

}
