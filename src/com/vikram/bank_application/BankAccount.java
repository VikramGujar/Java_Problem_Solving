package com.vikram.bank_application;

//Checked Exception: InsufficientFundsException
@SuppressWarnings("serial")
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Unchecked Exception: InvalidAmountException
@SuppressWarnings("serial")
class InvalidAmountException extends RuntimeException {
 public InvalidAmountException(String message) {
     super(message);
 }
}

//Checked Exception: AccountNotFoundException
@SuppressWarnings("serial")
class AccountNotFoundException extends Exception {
 public AccountNotFoundException(String message) {
     super(message);
 }
}

//Unchecked Exception: LoanNotAllowedException
@SuppressWarnings("serial")
class LoanNotAllowedException extends RuntimeException {
 public LoanNotAllowedException(String message) {
     super(message);
 }
}




class BankAccount implements Bank {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    

    public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Deposit amount must be greater than zero.");
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        balance -= amount;
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
        if (toAccount == null) throw new AccountNotFoundException("Target account not found.");
        if (amount <= 0) throw new InvalidAmountException("Transfer amount must be greater than zero.");
        if (amount > balance) throw new InsufficientFundsException("Insufficient funds for transfer.");
        this.withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Loan amount must be greater than zero.");
        if (amount > 50000 || balance < 50000)
            throw new LoanNotAllowedException("Loan not allowed: Amount exceeds limit or insufficient balance.");
        balance += amount; // Loan approved and added to balance
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

