package ua.edu.ucu.apps.flowerstore.flowers.items;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flowers.items.FlowerPack;
import java.util.ArrayList;
public class FlowerBucket {

    @Getter
    private ArrayList<FlowerPack> flowerBucket = new ArrayList();

    public void add(FlowerPack pack_to_add) {
        flowerBucket.add(pack_to_add);
    }
    public double getPrice() {
        double price = 0.0d;
        for (FlowerPack pack :getFlowerBucket()) {
            price += pack.getPacketPrice();
        }
        return price;
}
}
