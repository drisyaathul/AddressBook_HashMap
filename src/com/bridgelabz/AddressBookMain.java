package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    HashMap<String,Contact> hashMap=new HashMap<String,Contact>();

    void addContact(){
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Enter name of the Contact : ");
        contact.setContact(scanner.next());
        hashMap.put(contact.getContact(),contact);
        System.out.println("Contact added");
    }
    void addressBook(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name of the Address Book which you want to add contact :");
        String string = scanner.next();
        if(hashMap.containsKey(string)){
            Contact temp = hashMap.get(string);
            temp.addNewContact();
            System.out.println("Contact added");
        }
    }
    void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Contact to display : ");
        String string = scanner.next();
        if(hashMap.containsKey(string)){
            Contact temp = hashMap.get(string);
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBookMain addressBookMain = new AddressBookMain();
        while (true) {
            System.out.println("1. Add address book \n2. add Contact \n3. Display ");

            int chooseNumber = scanner.nextInt();
            switch (chooseNumber){
                case 1:
                    addressBookMain.addressBook();
                    break;
                case 2:
                    addressBookMain.addContact();
                    break;
                case 3:
                    addressBookMain.display();
                    break;
                default:
                    System.out.println("invalid Option choose");
                    break;
            }
        }
    }
}