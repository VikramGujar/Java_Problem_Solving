package com.vikram.bank_application;

public class LICIncomeTable {
    public static void main(String[] args) {
        // Constants
        double annualIncome = 5200000; // Annual income ₹52,00,000
        double interestRate = 0.055;   // 5.5% interest rate
        double withdrawalIncreaseRate = 0.06; // 6% annual increase in withdrawal
        int years = 50; // Number of years

        // Variables
        double withdrawalAmount = annualIncome * 0.60; // Initial withdrawal (60%)
        double remainingAmount = 0; // Initial remaining balance

        // Table header
        System.out.printf("%-5s %-20s %-30s %-30s%n", "Year", "Withdrawal", "Remaining(₹)", "End-of-Year(₹)");

        // Iterative calculation
        for (int year = 1; year <= years; year++) {
            // Add annual income to the remaining amount
            remainingAmount += annualIncome;

            // Subtract the withdrawal amount
            double remainingAfterWithdrawal = remainingAmount - withdrawalAmount;

            // Apply interest
            remainingAmount = remainingAfterWithdrawal * (1 + interestRate);

            // Print row for the year
            System.out.printf("%-5d %-20.2f %-30.2f %-30.2f%n", year, withdrawalAmount, remainingAfterWithdrawal, remainingAmount);

            // Update the withdrawal amount for the next year
            withdrawalAmount += withdrawalAmount * withdrawalIncreaseRate;
        }
    }
}
