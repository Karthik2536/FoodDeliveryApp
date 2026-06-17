package com.fooddelivery.payment;


public interface PaymentMethod {

    // Abstract method
    void processPayment(double amount);
}