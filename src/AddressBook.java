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

    // ---- UC3 : Edit contact ---------
    public void editContacts(String name, String newData, int number){
        boolean flag = true;
        for(Contact i : contacts){
            if(i.getFirstName().equalsIgnoreCase(name)){
                flag = false;
                if(number == 1) i.setFirstName(newData);
                else if(number == 2) i.setLastName(newData);
                else if(number == 3) i.setAddress(newData);
                else if(number == 4) i.setCity(newData);
                else if(number == 5) i.setState(newData);
                else if(number == 6) i.setZipCode(newData);
                else if(number == 7) i.setPhoneNumber(newData);
                else if(number == 8) i.setEmail(newData);
            }
        }

        if(flag == true){
            System.out.println("Contact not Found ");
        }
        else {
            System.out.println("Contact details with name " + name + " is updated. " );
        }
    }

}
