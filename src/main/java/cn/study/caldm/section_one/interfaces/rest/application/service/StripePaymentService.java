package cn.study.caldm.section_one.interfaces.rest.application.service;


public class StripePaymentService implements PaymentService {
    @Override 
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
