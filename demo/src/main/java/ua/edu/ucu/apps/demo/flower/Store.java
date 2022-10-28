package ua.edu.ucu.apps.demo.flower;

import java.util.ArrayList;

public class Store {
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public boolean getFlower(Flower flower) {
        return flowers.remove(flower);
    }

    public int search(Flower flower) {
        int count = 0;
        for (Flower value : flowers) {
            if (flower.equals(value)) {
                count++;
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Rose rose = new Rose();
//        FlowerColor flowerColor = FlowerColor.BLUE;
//        rose.setColor(flowerColor);
//        Store store = new Store();
//        store.addFlower(rose);
//        store.addFlower(rose);
//        store.addFlower(rose);
//        store.addFlower(rose);
//        store.addFlower(rose);
//        store.addFlower(rose);
//        System.out.println(store.search(rose));
//    }
}
