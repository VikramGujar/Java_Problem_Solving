package com.lab.dec_19;

public class Drawer extends Thread 
{

	private Account account;	//HAS-A Relation

	public Drawer(Account account) 
	{
		super();
		this.account = account;
	}
	
	public void run() 
	{
		int withdrawArray[] = {1200,500,700}; 
		
		for(int withdraw : withdrawArray) 
		{
			account.withdraw(withdraw);
			
		}
	}
	
	
	
}
