package cn.study.caldm.section_one.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class OrderService {
    private PaymentService paymentService;

    // 当用多个构造函数时，springboot倾向于使用没有参数的
    // public OrderService() {}

    // 可以通过 Autowired 指定 springboot 使用的构造函数。
    @Autowired 
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // 不存在无参数的构造方法，并且存在多个有参数的构造方法，并且没有使用 Autowired 指定时，springboot 会报错
    // public OrderService(PaymentService paymentService, int x) {}

    public void placeOrder() {
        paymentService.processPayment(10d);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
