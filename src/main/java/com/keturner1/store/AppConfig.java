package com.keturner1.store;

import com.keturner1.store.payment.OrderService;
import com.keturner1.store.payment.PayPalPaymentService;
import com.keturner1.store.payment.PaymentService;
import com.keturner1.store.payment.StripePaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    public String paymentgateway;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
//    @Scope("prototype")
    public OrderService orderService() {
        if (paymentgateway.equals("paypal")) {
            return new OrderService(paypal());
        }

        return new OrderService(stripe());
    }

}
