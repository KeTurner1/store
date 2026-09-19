package com.keturner1.store;


import com.keturner1.store.entities.Address;
import com.keturner1.store.entities.Profile;
import com.keturner1.store.entities.Tag;
import com.keturner1.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("name")
                .email("email")
                .password("password")
                .build();

        var profile = Profile.builder()
                .bio("bio")
                .loyaltyPoints(0L)
                .phoneNumber("phone number")
                .build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);

//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        var orderService2 = context.getBean(OrderService.class);
// //        var orderService = new OrderService(new PayPalPaymentService());
// //        orderService.setPaymentService(new PayPalPaymentService());
//        orderService.placeOrder();
//
//        var manager = context.getBean(NotificationManager.class);
//        manager.sendNotification("Test message");
//
//        context.getBean(HeavyResource.class);
//
//        context.close();

    }
}
