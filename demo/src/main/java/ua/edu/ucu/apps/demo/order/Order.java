package ua.edu.ucu.apps.demo.order;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.payment.Payment;
import java.util.LinkedList;

@Setter@Getter
public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public Order(Payment payment, Delivery delivery) {
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment strategy) {
        this.payment = strategy;
    }

    public void setDeliveryStrategy(Delivery strategy) {
        this.delivery = strategy;
    }

    public double calculateTotalPrice() {
        int total = 0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice())) {
            delivery.deliver(items);
        }
    }
}
