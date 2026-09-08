package cn.study.caldm.section_one.interfaces.rest.application.service;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10d);
    }
}
