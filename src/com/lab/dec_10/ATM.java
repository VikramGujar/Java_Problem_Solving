package com.lab.dec_10;

import java.util.Scanner;

public class ATM{



	public static void main(String[] args) {   

		Bank b=new BankAccount(67243190, 11000);
		BankAccount Vikram = new BankAccount(143545432, 5765);
		BankAccount Tejas = new BankAccount(143545432, 5765);
		Customer customerVikram = new Customer("Vikram", Vikram);
		Customer customerTejas = new Customer("Tejas", Tejas);
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select an option :");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer");
		System.out.println("4. Loan Application");
		System.out.println("5. Check Balance");
		System.out.println("6. Exit");
		
		System.out.println("\n\n");
		
		
		try(sc){
			System.out.print("Enter your option : ");
			int option = sc.nextInt();
			switch (option) {
			case 1: 
			{
				System.out.print("Enter ammount to Diposit :");
				double depositAmount = sc.nextDouble();
				b.deposit(depositAmount);
				break;
				
			}
			case 2: 
			{
				 System.out.print("Enter ammount to withdraw :");
				 double withdrawAmount = sc.nextDouble();
				 b.withdraw(withdrawAmount);
				 break;
				
			}
			case 3: 
			{
				System.out.print("Enter ammount to transfer :");
				double amountToTransfer = sc.nextInt();
				b.transfer(Vikram,amountToTransfer);
				break;
				
			}
			case 4: 
			{
				System.out.println("How much load you want");
				double loanAmount = sc.nextInt();
				b.applyForLoan(loanAmount);
				break;
			}
			case 5: 
			{
				System.out.println("Your current balance is :"+b.getBalance());
				break;
							
			}
			case 6: 
			{
				System.out.println("");
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
		}catch (Exception e) {
			
		}
		
		
		
		
		

	}

}
