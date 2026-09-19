package com.keturner1.store;


import com.keturner1.store.notification.NotificationManager;
import com.keturner1.store.payment.OrderService;
import com.keturner1.store.payment.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);
//        var orderService = new OrderService(new PayPalPaymentService());
//        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();

        var manager = context.getBean(NotificationManager.class);
        manager.sendNotification("Test message");

        context.getBean(HeavyResource.class);

        context.close();

    }
}
