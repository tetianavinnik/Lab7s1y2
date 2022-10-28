package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int amount;

    public int getPrice() {
        return flower.getPrice()*amount;
    }
}
