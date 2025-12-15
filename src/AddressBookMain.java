import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        Boolean running  = true;

        while(running){
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter First name: ");
                    String firstName = in.nextLine();

                    System.out.print("Enter Last name: ");
                    String lastName = in.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = in.nextLine();

                    System.out.print("Enter email address: ");
                    String emailAddress = in.nextLine();

                    System.out.println("Enter address details:");
                    String address = in.nextLine();

                    System.out.println("Enter City:");
                    String city = in.nextLine();

                    System.out.println("Enter State:");
                    String state = in.nextLine();

                    System.out.println("Enter Zip Code:");
                    String zipCode = in.nextLine();

                    Contact c1 = new Contact(firstName, lastName, phoneNumber, emailAddress, address, city, state, zipCode);
                    addressBook.addContact(c1);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Address Book.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }

    }
}
