package ua.edu.ucu.apps.demo.delivery;

import java.lang.Math;
import lombok.Getter;
import java.util.LinkedList;

@Getter
public abstract class Delivery {
    private final long orderNumber = (long) (Math.random()*100000000);
    public abstract String deliver(LinkedList items);
}
