package ua.edu.ucu.apps.demo.flower;

import ua.edu.ucu.apps.demo.order.Item;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }

    public int getPrice() {
        int total = 0;
        for (FlowerPack pack : packs) {
            total += pack.getPrice();
        }
        return total;
    }
}
