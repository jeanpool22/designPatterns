package com.sistemapago.paymentmethods;

public class PayPal {
    private String email;

    public PayPal(String mail) {
        this.email = mail;
    }

    public boolean procesarPago() {
        return true;
    }
}
