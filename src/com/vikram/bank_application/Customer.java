package com.vikram.bank_application;

public class Customer 
{
	
    @SuppressWarnings("unused")
	private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }
}
