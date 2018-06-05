package com.designpatterns.behavioral.strategy.example1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
