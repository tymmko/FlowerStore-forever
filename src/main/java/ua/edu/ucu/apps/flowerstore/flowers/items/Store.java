package ua.edu.ucu.apps.flowerstore.flowers.items;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> items = new ArrayList<>();

    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
