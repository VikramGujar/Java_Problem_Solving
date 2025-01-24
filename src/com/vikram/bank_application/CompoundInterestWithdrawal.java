package com.vikram.bank_application;

public class CompoundInterestWithdrawal {

    public static void main(String[] args) {
        double yearlyAmountReceived = 52_00_000; // ₹52 lakh
        double withdrawPercentage = 0.60; // 60% withdrawal
        double interestRate = 0.055; // 5.5% interest rate
        double totalMoney = 0; // Total money in the account
        double remainingMoney = 0; // Remaining money after withdrawal
        double compoundInterest = 0; // Compound interest in each year
        double annualWithdrawal = yearlyAmountReceived * withdrawPercentage; // Initial withdrawal

        double withdrawIncreasePercentage = remainingMoney * 0.06 ; // 6% increase in withdrawal each year
        

        System.out.println("Year\tReceived Amount\tWithdrawn Amount\tRemaining Amount\tCompound Interest\tRemaining + Interest\tTotal Money");
        
        // Simulating the situation for 50 years
        for (int year = 1; year <= 50; year++) {
            // Money received every year (fixed ₹52 lakh)
            double receivedThisYear = yearlyAmountReceived;

            // Calculate the compound interest on the remaining amount
            compoundInterest = remainingMoney * interestRate;

            // Update the remaining money with compound interest
            remainingMoney = remainingMoney + compoundInterest;

            // Withdraw the 60% of ₹52 lakh (increasing by 6% every year)
            double withdrawnThisYear = annualWithdrawal;
            remainingMoney -= withdrawnThisYear;

            // Add compound interest to the remaining balance
            double remainingWithInterest = remainingMoney + compoundInterest;

            // Update the total money in the account
            totalMoney = remainingWithInterest + receivedThisYear;

            // Print the table row for this year
            System.out.printf("%d\t₹%.2f\t₹%.2f\t₹%.2f\t₹%.2f\t₹%.2f\t₹%.2f\n", 
                year, receivedThisYear, withdrawnThisYear, remainingMoney, compoundInterest, remainingWithInterest, totalMoney);

            // Increase the withdrawal amount by 6% for the next year
            annualWithdrawal *= (1 + withdrawIncreasePercentage);
        }
    }
}
