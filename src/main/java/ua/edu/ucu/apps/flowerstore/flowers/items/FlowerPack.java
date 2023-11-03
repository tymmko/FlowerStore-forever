package ua.edu.ucu.apps.flowerstore.flowers.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {
    private Flower flower;
    private int amount;
    private double price;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }
    public double getPacketPrice() {
        price = flower.getPrice() * amount;
        return price;
    }
}
