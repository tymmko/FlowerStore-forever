package ua.edu.ucu.apps.flowerstore.flowers.delivery;

import java.util.LinkedList;
import ua.edu.ucu.apps.flowerstore.flowers.items.Item;
public interface Delivery {
    public String delivery(LinkedList<Item> items);
}