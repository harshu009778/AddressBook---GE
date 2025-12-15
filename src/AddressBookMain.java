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
            System.out.println("3. Edit Contacts");
            System.out.println("4. Exit");
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
                    System.out.println("Enter the contact name :");
                    String name = in.nextLine();

                    boolean flag = true;

                    while(flag){
                        System.out.println("What do you want to update next ? ");
                        System.out.println("1. First Name");
                        System.out.println("2. Last Name ");
                        System.out.println("3. Address ");
                        System.out.println("4. City ");
                        System.out.println("5. State ");
                        System.out.println("6. zip code");
                        System.out.println("7. Phone Number");
                        System.out.println("8. Email ");
                        System.out.println("9. Exit");
                        System.out.print("Choose an option: ");

                        int ch = in.nextInt();
                        in.nextLine();

                        switch (ch){
                            case 1:
                                System.out.print("Enter New First name: ");
                                String newfirstName = in.nextLine();

                                addressBook.editContacts(name, newfirstName,1);
                                break;
                            case 2:
                                System.out.print("Enter New Last name: ");
                                String newLastName = in.nextLine();

                                addressBook.editContacts(name, newLastName,2);
                                break;
                            case 3:
                                System.out.print("Enter New Address : ");
                                String newAddress = in.nextLine();

                                addressBook.editContacts(name, newAddress,3);
                                break;
                            case 4:
                                System.out.print("Enter New City: ");
                                String newCity = in.nextLine();

                                addressBook.editContacts(name, newCity,4);
                                break;
                            case 5:
                                System.out.print("Enter New State: ");
                                String newState = in.nextLine();

                                addressBook.editContacts(name, newState,5);
                                break;
                            case 6:
                                System.out.print("Enter New ZipCode: ");
                                String newZipCode = in.nextLine();

                                addressBook.editContacts(name, newZipCode,6);
                                break;
                            case 7:
                                System.out.print("Enter New Phone number : ");
                                String newNo = in.nextLine();

                                addressBook.editContacts(name, newNo,7);
                                break;
                            case 8:
                                System.out.print("Enter New Email : ");
                                String newEmail = in.nextLine();

                                addressBook.editContacts(name, newEmail,8);
                                break;
                            case 9:
                                flag = false;
                                System.out.println("Exiting. ");
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");



                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Address Book.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }

    }
}
