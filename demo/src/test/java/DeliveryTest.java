import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.FlowerColor;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import ua.edu.ucu.apps.demo.order.Order;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.Payment;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {
    private Delivery delivery1;
    private Delivery delivery2;
    private Order order1;
    private Order order2;

    @BeforeEach
    public void init() {
        delivery1 =  new DHLDeliveryStrategy();
        delivery2 = new PostDeliveryStrategy();
        Flower item = new Flower(12.5, FlowerColor.RED, 12);
        FlowerBucket flowerBucket = new FlowerBucket();
        FlowerPack flowerPack = new FlowerPack(item, 12);
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);
        Payment payment = new CreditCardPaymentStrategy("James", "");
        order1 = new Order(payment, delivery1);
        order2 = new Order(payment, delivery2);
        order1.addItem(flowerBucket);
        order2.addItem(flowerBucket);
    }

    @Test
    public void testPrice() {
        assertEquals("Your order: "+delivery1.getOrderNumber()+" will be delivered by DHL", delivery1.deliver(order1.getItems()));
        assertEquals("Your order: "+delivery2.getOrderNumber()+" will be delivered by post", delivery2.deliver(order2.getItems()));
    }
}