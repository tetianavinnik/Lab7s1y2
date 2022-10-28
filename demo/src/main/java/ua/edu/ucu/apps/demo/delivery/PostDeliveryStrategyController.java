package ua.edu.ucu.apps.demo.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import ua.edu.ucu.apps.demo.order.Order;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.Payment;

@RequestMapping(path = "/api/v1/postdelivery") @RestController
public class PostDeliveryStrategyController {
    @GetMapping
    public String getDelivery() {
        Flower item = new Flower(12.5, FlowerColor.RED, 12);
        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(item, 12);
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);
        Payment payment = new PayPalPaymentStrategy("James", "");
        Delivery delivery = new PostDeliveryStrategy();
        Order order = new Order(payment, delivery);
        order.addItem(flowerBucket);
        order.addItem(flowerBucket);
        PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
        return postDeliveryStrategy.deliver(order.getItems());
    }
}
