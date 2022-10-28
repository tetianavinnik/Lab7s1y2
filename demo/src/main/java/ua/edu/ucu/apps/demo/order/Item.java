package ua.edu.ucu.apps.demo.order;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public abstract class Item {
    private String description = "";
    public abstract int getPrice();
}
