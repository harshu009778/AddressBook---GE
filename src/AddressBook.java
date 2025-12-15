import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    // ------ UC2 - Ability to add a new Contact to Address Book --------------------
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

    // ---- UC3 : Edit contact using person's name ----------------------------------
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
            System.out.println("Contact to be updated does not exists.");
        }
        else {
            System.out.println("Contact details with name " + name + " is updated. " );
        }
    }


    // -------- UC4 : Delete a person using person's name --------------

    public void deleteContact(String firstName){
        boolean flag = false;
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                it.remove();
                flag = true;
                break; // remove first match
            }
        }

        if(!flag){
            System.out.println("Contact to be deleted does not exists. ");
        }
        else {
            System.out.println("Contact details with name " + firstName + " is deleted. " );
        }
    }

}
