package addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private final ArrayList<Contact> addressBook=new ArrayList<>();

    public void showDetails(){
        for(Contact contact : addressBook ){
            System.out.println(contact);
        }
    }


    public void addPerson() {
        Contact contact=new Contact();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your first name : ");
        contact.setFirstName(scanner.next());
        System.out.print("Enter your last name : ");
        contact.setLastName(scanner.next());
        System.out.print("Enter your address : ");
        scanner.nextLine();
        contact.setAddress(scanner.nextLine());
        System.out.print("Enter your city : ");
        contact.setCity(scanner.next());
        System.out.print("Enter your zip : ");
        contact.setZip(scanner.next());
        System.out.print("Enter your phone number : ");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.print("Enter your email : ");
        contact.setEmail(scanner.next());
        addressBook.add(contact);
    }

    public void editPerson() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fName=scanner.next();
        System.out.print("Enter last name : ");
        String lName=scanner.next();
        int i=0;
        for(Contact contact:addressBook) {
            i++;
            if(contact.getFirstName().equals(fName)) {
                if(contact.getLastName().equals(lName)) {
                    System.out.print("Enter your address : ");
                    scanner.nextLine();
                    contact.setAddress(scanner.nextLine());
                    System.out.print("Enter your city : ");
                    contact.setCity(scanner.next());
                    System.out.print("Enter your zip : ");
                    contact.setZip(scanner.next());
                    System.out.print("Enter your phone number : ");
                    contact.setPhoneNumber(scanner.nextLong());
                    System.out.print("Enter your email : ");
                    contact.setEmail(scanner.next());
                }
            } else if(i==addressBook.size()){
                System.out.println("Person is not found.");
            }
        }
    }

    /*public void deletePerson() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fName=scanner.next();
        System.out.print("Enter last name : ");
        String lName=scanner.next();
        int i=0;
        for(Contact contact:addressBook) {
            i++;
            if(contact.getFirstName().equals(fName)) {
                if(contact.getLastName().equals(lName)) {
                    addressBook.remove(contact);
                }
            } else if(i==addressBook.size()){
                System.out.println("Person is not found.");
            }
        }
    }*/

}
