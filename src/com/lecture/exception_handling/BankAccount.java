package com.lecture.exception_handling;


	@SuppressWarnings("serial")
	final class WithdrawException extends Exception 
	{
		public WithdrawException(String msg) 
		{
			super(msg);
		}
	}
	
	
	
	
	public class BankAccount {
	
	private int balance;


	public BankAccount(int balance) {
    this.balance = balance;
	}


	public void withdraw(int amount) throws WithdrawException 
	{
    if (amount > balance) {
        throw new WithdrawException("Insufficient balance! Available balance: " + balance);
    }
    balance -= amount;
    System.out.println("Withdrawal successful! Remaining balance: " + balance);
	}

	public static void main(String[] args) {
    BankAccount account = new BankAccount(10000); // Initialize account with 10,000 balance

    try {
        int withdrawAmount = 11100; // Amount to withdraw
        System.out.println("Attempting to withdraw: " + withdrawAmount);
        account.withdraw(withdrawAmount); // Call withdraw method
    } catch (WithdrawException e) {
        System.err.println("Error: " + e.getMessage());
        e.printStackTrace();
    } finally {
        System.out.println("Thank you for using our banking service!");
    }
}

}
