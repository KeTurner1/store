package com.keturner1.store.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiURL;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.currencies}")
    private List<String> currencies;


    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("aitURL: " + apiURL);
        System.out.println("enabled: " + enabled);
        System.out.println("timeout: " + timeout);
        System.out.println("currencies: " + currencies);
        System.out.println("amount: " + amount);
    }
}
