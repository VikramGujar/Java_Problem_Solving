package com.lab.dec_19;

public class Depositor extends Thread 
{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	} 
	
	public void run() 
	{
		int depositArray[] = {300,500,900,700, 500,200}; 
		
		for(int deposit : depositArray) 
		{
			account.deposit(deposit);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
		}
	}
	
}
