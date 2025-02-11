package com.assignment.task;

import java.util.Scanner;

public class BankTransactionSystem 
{
	private double balance;	// Account balance
	
	public void deposit(double amount)	// Method to deposit amount
	{
		if(amount<0)	// Amount validation
		{
			System.err.println("Amount should be greater than 0");
		}else
		this.balance += amount;	// Updating balance
		System.out.println("Amount disposited succesfully!");
		System.out.println("Balance : "+this.balance);	// Printing updated balance
	}
	
	public void withdraw(double amount)
	{
		if(amount<0)
		{
			System.err.println("Amount should be greater than 0");
		}else if(amount > balance)	// Checking for balance is sufficient or not
		{
			System.err.println("Low balance");	// user friendly MSG to user
			System.out.println("You are trying to withdraw "+amount+" your balance is "+balance+"");
		}else
		this.balance -= amount;
		System.out.println("Amount disposited succesfully!");
		System.out.println("Balance : "+this.balance);	// Balance After withdraw
	}
	
	public void viewBalance()
	{
		// Printing current balance
		System.out.println("Your current balance is : "+balance);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		BankTransactionSystem bts = new BankTransactionSystem();
		
		while(true)
		{
		
		System.out.println("\n******** Welcome To Bank Transaction System ********\n");
		System.out.println(""
				+ "\t 1. Deposit \n"
				+ "\t 2. Withdraw \n"
				+ "\t 3. View Balance \n"
				+ "\t 4. Exit\n");
		
		System.out.print("\n\tEnter your choice :");
		int choice = Integer.parseInt(sc.nextLine());
		
		switch (choice) // Switch for users choice
		{
		
		case 1: //Diposit
		{
			System.out.println("Enter amount you want to diposit :");
			double amount = Double.parseDouble(sc.nextLine());
			bts.deposit(amount);
			break;
		}
		
		case 2: //Withdraw
		{
			System.out.println("Enetr amount you want to withdraw :");
			double amount = Double.parseDouble(sc.nextLine());
			bts.withdraw(amount);
			break;
		}
		
		case 3: //Get Balance
		{
			bts.viewBalance();
			break;
		}
		
		case 4: // Exit from program
		{
			System.out.println("Bank Transaction System Exited");
			System.exit(0);
			break;
		}
		
		default:
			System.err.println("Invalid Choice : " + choice);
		}
		
		
	}
	}
	

}
/*


Task 2: Bank Transaction System

Problem:
Create a program that simulates a bank account with the following functionalities:

Deposit: Add money to the account.
Withdraw: Deduct money from the account (only if the balance is sufficient).
View Balance: Display the current balance.
Exit: Terminate the program.
Constraints:

The program should run in a loop until the user chooses to exit.
If the withdrawal amount is greater than the available balance, display an appropriate message.
I/P:

1. Deposit 5000

2. Withdraw 2000

3. View Balance

O/P:

Deposit Successful! Balance: 5000

Withdrawal Successful! Balance: 3000

Current Balance: 3000

*/