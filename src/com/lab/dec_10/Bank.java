package com.lab.dec_10;


public interface Bank {


	public void deposit(double amount)throws InvalidAmountException;
	//Deposits the specified amount into the account. 
	//Throws InvalidAmountException if the amount is less than or equal to zero.

	public void withdraw(double amount)throws InsufficientFundsException, InvalidAmountException;
		//Withdraws the specified amount from the account. 
		//Throws InsufficientFundsException if the amount is greater than the account balance. 
		//Throws InvalidAmountException if the amount is less than or equal to zero.

	public void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
	//Transfers the specified amount to another account. 
	//Throws InsufficientFundsException if the amount is greater than the account balance. 
	//Throws AccountNotFoundException if the target account is not found. 
	//Throws InvalidAmountException if the amount is less than or equal to zero.

	public void applyForLoan(double amount);
	//Applies for a loan of the specified amount(50000). 
	//Throws LoanNotAllowedException if the loan amount exceeds the allowed limit(50000) 
	//or if the balance is less than specified amount(50000). 
	//Throws InvalidAmountException if the amount is less than or equal to zero.

	public double getBalance();
	//Returns the current balance of the account.

	
}
