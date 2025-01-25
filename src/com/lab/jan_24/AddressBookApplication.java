package com.lab.jan_24;

public class AddressBookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Program 02 
----------
You have to create an Address Book application in Java that utilizes a Contact class to represent contacts. The program should allow users to maintain an address book, add new contacts, remove existing contacts, and exit the application.

You are provided with a Java program for the Address Book application. The program includes a Contact class that represents contacts, and it has some issues. Your task is to complete the implementation and ensure that it works correctly.

Requirements:

The program should display the following menu to the user:


Address Book:
(List of contacts displayed here)

Options:
1. Add Contact
2. Remove Contact
3. Exit
Enter your choice:
If the address book is empty, it should indicate that the address book is empty.
Implement the following functionality for each menu option:

Add Contact (Option 1): Allow the user to enter the contact's name and their phone number. Create a new Contact object with the provided information and add it to the address book using the name as the key and the Contact object as the value. Print a confirmation message indicating that the contact has been added.

Remove Contact (Option 2): If the address book is empty, display a message indicating that it's empty. Otherwise, allow the user to enter the name of the contact to remove. If the contact name is found in the address book, remove the contact and print a confirmation message. If the contact name is not found, print an error message.

Exit (Option 3): Display a farewell message and exit the program.

For any other invalid input, display a message indicating that the choice is invalid and ask the user to select a valid option.

The program should run in a continuous loop until the user selects the "Exit" option.

Your Task:

Complete the implementation of the provided Java code.

Ensure that the program handles user input correctly and provides the expected functionality as described in the requirements.

Test the program thoroughly to ensure it works as expected.

Submit the complete Java code for the Address Book application.

Note: You can use the provided Java code as a starting point and make any necessary modifications to meet the requirements of the problem statement.
*/