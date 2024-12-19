package com.lab.dec_19;

public class Account {
	
	private int balance = 0;
	
	
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}


	public synchronized void withdraw(int amount)
	{
		
		while (balance < amount) 
		{						
				try 
				{
					System.out.println("Your balnce is : "+balance);
					System.out.println("You are trying to withdraw : "+ amount);					
					System.out.println("Balance is low waiting for deposit ");
					wait();
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			
		}
		balance =balance - amount;
		System.out.println("Balance after withdraw is : "+balance);
		notify();
	}
	  
	
	public synchronized void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println("Depositing "+amount);
		System.out.println("Balance after diposit is : "+balance);
		notify();
	}
	  


}
