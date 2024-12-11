package com.lab.dec_10;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException() {
		
	}
	public InsufficientFundsException(String errMessage) {
		super(errMessage);
	}
	
}


class InvalidAmountException extends Exception{
	public InvalidAmountException() {
		
		
	}
	public InvalidAmountException(String errMessage) {
		super(errMessage);
	}
	
}


class AccountNotFoundException extends Exception{
	public AccountNotFoundException() {
		
	}
	public AccountNotFoundException(String errMessage) {
		super(errMessage);
	}
	
}


class LoanNotAllowedException extends RuntimeException{
	public LoanNotAllowedException() {
		
	}
	public LoanNotAllowedException(String errMessage) {
		super(errMessage);
	}
	
}


public class BankAccount implements Bank {

	private long accountNumber;
	private double balance;
	
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	

	public long getAccountNumber() {
		return accountNumber;
	}




	@Override
	public void deposit(double amount)throws InvalidAmountException {
		try {
			if(amount<1) {
				throw new InvalidAmountException("Invalid amount");
			}else {
				this.balance = this.balance + amount;
				System.out.println("Amount diposited succesfully!!!");
				System.out.println("Your balance is :"+this.balance);
			}
		}catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
		
		} 
	}


	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException{
		    if(amount<0||amount>balance) {
			try {
				if(amount <= 0) {
					throw new InvalidAmountException("Invalid ammount");
				
				}
				}catch (InvalidAmountException e) {
					System.err.println(e.getMessage());	
				}
			try {
			if(balance<amount) {
			throw new InsufficientFundsException("Insufficient balance");
		}
			}catch(InsufficientFundsException e) {
			System.err.println(e.getMessage());	
			}
		    }else {
			
			this.balance = this.balance - amount;
			System.out.println("You have withraw : "+amount);
			System.out.println("Your current balance is : "+this.balance);
		}
	}

	@Override
	public void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		try {
			if(amount<=0) {
				throw new InvalidAmountException("Invalid amount");
			}
			try {
				if(!(toAccount instanceof BankAccount)) {
					throw new AccountNotFoundException("Account dose not exist");
				}
				try {
					if(this.balance<amount) {
						throw new InsufficientFundsException("Insufficient balance");
					}else {
						System.out.println("Before transfer :");
						System.out.println("----------------");
						System.out.println("\n\n Sender \n Account Number : "+this.getAccountNumber()+"\n Balance : "+this.getBalance());
						System.out.println("\n\nReciver \n Account Number : "+toAccount.getAccountNumber()+"\n Balance : "+toAccount.getBalance());
						toAccount.balance = toAccount.balance + amount;
						toAccount.getAccountNumber();
						toAccount.getBalance();
						System.out.println(amount+" transfered from account number "+this.getAccountNumber()+" to account number"+toAccount.getAccountNumber());
						System.out.println("==============================================================");
						System.out.println("After transfer :");
						System.out.println("----------------");
						System.out.println("\n\nSender \n Account Number : "+this.getAccountNumber()+"\n Balance : "+this.getBalance());
						System.out.println("\n\nReciver \n Account Number : "+toAccount.getAccountNumber()+"\n Balance : "+toAccount.getBalance());
						
					}
				}catch (InsufficientFundsException e) {
					System.err.println(e.getMessage());
				}
			}catch (AccountNotFoundException e) {
				System.err.println(e.getMessage());
			}
		}catch (InvalidAmountException e) {
				System.err.println(e.getMessage());
			}
		}

		
	


	@Override
	public void applyForLoan(double amount) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
