package com.vikram.bank_application;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize accounts
        BankAccount account1 = new BankAccount(101, 150000);
        BankAccount account2 = new BankAccount(102, 240000);
        Customer customer1 = new Customer("Vikram", account1);
        
        

        System.out.println("Welcome, " + customer1.getAccount().getBalance());
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Loan Application");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");

            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        customer1.getAccount().deposit(depositAmount);
                        System.out.println("Deposit successful. Current balance: " + customer1.getAccount().getBalance());
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        customer1.getAccount().withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful. Current balance: " + customer1.getAccount().getBalance());
                        break;

                    case 3:
                        System.out.print("Enter transfer amount: ");
                        double transferAmount = scanner.nextDouble();
                        customer1.getAccount().transfer(account2, transferAmount);
                        System.out.println("Transfer successful. Your balance: " + customer1.getAccount().getBalance());
                        break;

                    case 4:
                        System.out.print("Enter loan amount: ");
                        double loanAmount = scanner.nextDouble();
                        customer1.getAccount().applyForLoan(loanAmount);
                        System.out.println("Loan approved. Current balance: " + customer1.getAccount().getBalance());
                        break;

                    case 5:
                        System.out.println("Current balance: " + customer1.getAccount().getBalance());
                        break;

                    case 6:
                        exit = true;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidAmountException | LoanNotAllowedException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InsufficientFundsException | AccountNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred.");
            }
        }
        scanner.close();
    }
}
