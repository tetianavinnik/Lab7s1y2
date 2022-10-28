package ua.edu.ucu.apps.demo.delivery;

import java.util.LinkedList;

public class DHLDeliveryStrategy extends Delivery {
    @Override
    public String deliver(LinkedList items) {
        return "Your order: " + this.getOrderNumber()
                + " will be delivered by DHL";
    }
}
