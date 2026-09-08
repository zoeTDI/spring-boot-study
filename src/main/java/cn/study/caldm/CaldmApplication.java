package cn.study.caldm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cn.study.caldm.section_one.interfaces.rest.application.service.OrderService;
import cn.study.caldm.section_one.interfaces.rest.application.service.PayPalPaymentService;
import cn.study.caldm.section_one.interfaces.rest.application.service.StripePaymentService;

@SpringBootApplication
public class CaldmApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CaldmApplication.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		// OrderService需要支付服务，于是注入PayPalPaymentService，但是实际项目中，PayPalPaymentService也有自己的依赖项，也许要注入对象，那么我们需要注入的对象就非常多。
		// springboot 非常方便的一点就是，它可以自动创建这些对象，并帮我注入进去。
		// OrderService orderService = new OrderService(new PayPalPaymentService());
		// 可选项可以通过setter设置，但是此处的PaymentService是必选项，更推荐在构建方法中传入。
		// orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}


	// Bean 一种 IOC 容器对象。
}
