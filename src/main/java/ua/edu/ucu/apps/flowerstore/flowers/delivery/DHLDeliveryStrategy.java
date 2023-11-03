package ua.edu.ucu.apps.flowerstore.flowers.delivery;

import java.util.LinkedList;
import ua.edu.ucu.apps.flowerstore.flowers.items.Item;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String delivery(LinkedList<Item> items) {
        return "Delivery: DHL";
    }
}