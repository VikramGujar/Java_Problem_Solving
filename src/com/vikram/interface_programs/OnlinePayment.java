package com.vikram.interface_programs;

	abstract class OnlinePayment implements Payment {
    protected String paymentId;

    OnlinePayment(String paymentId) {
        this.paymentId = paymentId;
    }

    // Common method for all online payments
    void transactionDetails() {
        System.out.println("Transaction ID: " + paymentId);
    }
}
