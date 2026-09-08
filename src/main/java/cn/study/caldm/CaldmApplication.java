package cn.study.caldm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.study.caldm.section_one.interfaces.rest.application.service.OrderService;
import cn.study.caldm.section_one.interfaces.rest.application.service.PayPalPaymentService;
import cn.study.caldm.section_one.interfaces.rest.application.service.StripePaymentService;

@SpringBootApplication
public class CaldmApplication {

	public static void main(String[] args) {
		// SpringApplication.run(CaldmApplication.class, args);
		OrderService orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
