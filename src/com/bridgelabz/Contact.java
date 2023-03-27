package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;

public class Contact extends CollectionClass {
    AddressBook addressBook = new AddressBook();
    Scanner scanner = new Scanner(System.in);
    private String Contact;

    public void addNewContact() {

        AddressBook newContacts = new AddressBook();

        System.out.println("Enter the FirstName : ");
        newContacts.setFirstName(scanner.next());
        System.out.println("Enter the Second Name : ");
        newContacts.setSecondName(scanner.next());
        System.out.println("Enter the Address : ");
        newContacts.setAddress(scanner.next());
        System.out.println("Enter the City : ");
        newContacts.setCity(scanner.next());
        System.out.println("Enter the State : ");
        newContacts.setState(scanner.nextLine());
        System.out.println("Enter the Zip : ");
        newContacts.setZip(scanner.next());
        System.out.println("Enter the Phone Number : ");
        newContacts.setPhoneNumber(scanner.next());
        System.out.println("Enter the E-mail id : ");
        newContacts.setEMail(scanner.next());
        contactDetails.add(newContacts);
    }
    public void displayDetails() {
        System.out.println(contactDetails);
    }
    public String toString() {
        return "AddressBook{" +
                "contact=" + addressBook +
                '}';
    }

    public void setContact(String contact) {
         Contact = contact;
    }

    public String getContact() {
        return Contact;
    }
}