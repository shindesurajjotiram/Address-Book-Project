package addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        int i;
        do {
            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n");
            System.out.println("Welcome to Address Book");
            System.out.print("\n\n");

            addressBook.showDetails();

            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n\n");

            System.out.println("Enter 1 to add a new person to Address Book.");
            System.out.println("Enter 2 to edit existing person using their name.");
            System.out.println("Enter 3 to delete a person using their name.");
            System.out.println("Enter 4 to add multiple person to Address Book.");
            System.out.println("Enter 5 ");
            System.out.println("Enter 6 to exit.");
            System.out.println("\n");
            System.out.print("Enter your option here : ");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    addressBook.addPerson();
                    break;
                case 2:
                    addressBook.editPerson();
                    break;
                case 3:
                    addressBook.deletePerson();
                    break;
                case 4:
                    System.out.print("Enter number of persons you whant to add : ");
                    int noOfPersons=scanner.nextInt();
                    for(int ii=0;ii<noOfPersons;ii++) {
                        addressBook.addPerson();
                    }
                    break;
                case 5:
                default:
                    System.out.println("Enter the given options only.\n");


            }


        } while (i != 5);


    }
}
